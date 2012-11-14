package org.mael.chan4j;

import java.io.IOException;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.http.client.fluent.Request;

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

		String json = null;

		try {

			json = Request
					.Get("http://api.4chan.org/"
							+ this.page.getBoard().getName() + "/res/"
							+ this.getPosts().get(0).getPostNumber() + ".json")
					.execute().returnContent().asString();
		} catch (IOException e) {

			throw new FourChanException("Cannot get JSON request", e);
		}

		FourChanThread thread = new GsonBuilder()
				.excludeFieldsWithoutExposeAnnotation().create()
				.fromJson(json, FourChanThread.class);

		return thread;

	}

	public FourChanPage getPage() {
		return page;
	}

	public void setPage(FourChanPage page) {
		this.page = page;
	}

}
