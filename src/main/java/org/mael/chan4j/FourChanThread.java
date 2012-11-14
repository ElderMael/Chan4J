package org.mael.chan4j;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.google.gson.annotations.Expose;

public class FourChanThread {

	@Expose
	private List<FourChanPost> posts;

	public FourChanThread() {

	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
				.append("Posts", this.posts).build();
	}

	public List<FourChanPost> getPosts() {
		return posts;
	}

	public void setPosts(List<FourChanPost> posts) {
		this.posts = posts;
	}

}
