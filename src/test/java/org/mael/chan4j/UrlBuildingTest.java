package org.mael.chan4j;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UrlBuildingTest {

	private static final String HTTP_4CHAN_G_PREFIX_URL = "http://4chan.org/g/res/";
	private static final String HTTPS_4CHAN_G_PREFIX_URL = "https://4chan.org/g/res/";
	private static final String JSON_EXT_4CHAN = ".json";
	private static final String HTTP_API_4CHAN_URL_PREFIX = "http://api.4chan.org/g/res/";
	private static final String HTTPS_API_4CHAN_URL_PREFIX = "https://api.4chan.org/g/res/";
	private static final String THREAD_RESOURCE = "/res/";
	private static final String HTTP_4CHAN_URL_PREFIX = "http://boards.4chan.org/";
	private static final String HTTPS_4CHAN_URL_PREFIX = "https://boards.4chan.org/";

	private FourChanPreviewThread previewThread;

	private FourChanPost threadPost;

	private FourChanPost replyPost;

	@Before
	public void getThread() {
		this.previewThread = FourChan.fromBoard("g").fromPage(0).allThreads()
				.get(0);

		this.threadPost = previewThread.getPosts().get(0);

		this.replyPost = previewThread.getPosts().get(1);
	}

	@Test
	public void replyPostUrlTest() {

		String actual = this.replyPost.buildUrl(true);

		String expected = HTTPS_4CHAN_G_PREFIX_URL
				+ this.threadPost.getPostNumber() + "#p"
				+ this.replyPost.getPostNumber();

		assertEquals(expected, actual);

		System.out.println(actual);

	}

	@Test
	public void threadPostUrlTest() {

		String actual = this.threadPost.buildUrl(true);

		String expected = HTTPS_4CHAN_G_PREFIX_URL
				+ this.threadPost.getPostNumber();

		assertEquals(expected, actual);

		expected = HTTP_4CHAN_G_PREFIX_URL + this.threadPost.getPostNumber();

		actual = this.threadPost.buildUrl(false);

		assertTrue(this.threadPost.isThreadPost());

		assertEquals(expected, actual);

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
