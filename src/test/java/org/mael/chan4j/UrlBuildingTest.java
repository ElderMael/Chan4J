package org.mael.chan4j;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UrlBuildingTest {

	private static final String JSON_EXT_4CHAN = ".json";
	private static final String HTTP_API_4CHAN_URL_PREFIX = "http://api.4chan.org/g/res/";
	private static final String HTTPS_API_4CHAN_URL_PREFIX = "https://api.4chan.org/g/res/";
	private static final String THREAD_RESOURCE = "/res/";
	private static final String HTTP_4CHAN_URL_PREFIX = "http://boards.4chan.org/";
	private static final String HTTPS_4CHAN_URL_PREFIX = "https://boards.4chan.org/";

	private FourChanPreviewThread previewThread;

	@Before
	public void getThread() {
		this.previewThread = FourChan.fromBoard("g").fromPage(0).allThreads()
				.get(0);
	}

	@Test
	public void threadUrlTest() {

		String httpsUrl = previewThread.buildThreadUrl(true);

		String expected = HTTPS_4CHAN_URL_PREFIX
				+ this.previewThread.getPage().getBoard().getName()
				+ THREAD_RESOURCE
				+ this.previewThread.getPosts().get(0).getPostNumber();

		assertEquals(expected, httpsUrl);

		String httpUrl = previewThread.buildThreadUrl(false);

		expected = HTTP_4CHAN_URL_PREFIX
				+ this.previewThread.getPage().getBoard().getName()
				+ THREAD_RESOURCE
				+ this.previewThread.getPosts().get(0).getPostNumber();

		assertEquals(expected, httpUrl);

	}

	@Test
	public void threadUrlJsonTest() {

		String httpsUrl = previewThread.buildThreadJsonUrl(true);

		String expected = HTTPS_API_4CHAN_URL_PREFIX
				+ previewThread.getPosts().get(0).getPostNumber().toString()
				+ JSON_EXT_4CHAN;

		assertEquals(expected, httpsUrl);

		String httpUrl = previewThread.buildThreadJsonUrl(false);

		expected = HTTP_API_4CHAN_URL_PREFIX
				+ previewThread.getPosts().get(0).getPostNumber().toString()
				+ JSON_EXT_4CHAN;

		assertEquals(expected, httpUrl);

	}

}
