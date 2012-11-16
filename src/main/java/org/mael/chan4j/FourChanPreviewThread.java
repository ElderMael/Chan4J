package org.mael.chan4j;

import java.io.IOException;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.mael.chan4j.utils.HttpUtils;

import com.google.gson.GsonBuilder;

public class FourChanPreviewThread extends FourChanThread {

	private FourChanPage page;

	public FourChanPreviewThread() {

	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
				.append("Posts", this.getPosts()).build();
	}

	public FourChanThread expand() {
		return this.expand(false);
	}

	public FourChanThread expand(boolean useHttps) {

		String json = null;

		try {
			json = HttpUtils.getContentFromUrl(buildThreadUrl(useHttps));
		} catch (IOException e) {
			throw new FourChanException("Cannot get JSON request", e);
		}

		FourChanThread thread = new GsonBuilder()
				.excludeFieldsWithoutExposeAnnotation().create()
				.fromJson(json, FourChanThread.class);

		return thread;

	}

	public String buildThreadUrl(boolean useHttps) {

		String protocol = "http";

		if (useHttps) {
			protocol = "https";
		}

		return protocol + "://api.4chan.org/" + this.page.getBoard().getName()
				+ "/res/" + this.getPosts().get(0).getPostNumber() + ".json";
	}

	public FourChanPage getPage() {
		return page;
	}

	public void setPage(FourChanPage page) {
		this.page = page;
	}

}
