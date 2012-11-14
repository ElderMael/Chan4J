package org.mael.chan4j;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.fluent.Request;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FourChanPage {

	private int pageNumber;

	private FourChanBoard board;

	@Expose
	@SerializedName("threads")
	private List<FourChanPreviewThread> threads;

	public FourChanPage(FourChanBoard fourChanBoard, int pageNumber) {

		this.board = fourChanBoard;

		this.pageNumber = pageNumber;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public FourChanBoard getBoard() {
		return board;
	}

	public void setBoard(FourChanBoard board) {
		this.board = board;
	}

	public List<FourChanPreviewThread> allThreads() {

		String json = null;

		try {

			json = Request
					.Get("http://api.4chan.org/" + this.board.getName() + "/"
							+ pageNumber + ".json").execute().returnContent()
					.asString();
		} catch (IOException e) {

			throw new FourChanException("Cannot get JSON request", e);
		}

		FourChanPage page = new GsonBuilder()
				.excludeFieldsWithoutExposeAnnotation().create()
				.fromJson(json, FourChanPage.class);

		for (FourChanPreviewThread thread : page.getThreads()) {
			thread.setPage(this);
		}

		return page.getThreads();
	}

	public List<FourChanPreviewThread> getThreads() {
		return threads;
	}

	public void setThreads(List<FourChanPreviewThread> threads) {
		this.threads = threads;
	}

}
