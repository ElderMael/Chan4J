package org.mael.chan4j;

import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetThreadsTest {

	@Test
	public void getThreadsByBoardAndPageNumber() {

		List<FourChanPreviewThread> previewThreads = FourChan.fromBoard("g")
				.fromPage(0).allThreads();

		assertNotNull(previewThreads);

	}

	@Test
	public void getThreadCommentsFromThreads() {

		List<FourChanPreviewThread> previewThreads = FourChan.fromBoard("g")
				.fromPage(0).allThreads();

		for (FourChanPreviewThread thread : previewThreads) {

			assertNotNull(thread.getPosts().get(0).getComment());

		}

	}

	@Test
	public void getAllPostsFromThread() {

		FourChanPreviewThread previewThread = FourChan.fromBoard("g")
				.fromPage(0).allThreads().get(0);

		FourChanThread thread = previewThread.expand();

		assertNotNull(thread);

		assertNotNull(thread.getPosts());

		assertNotNull(thread.getPosts().get(0).getPostNumber());

	}

}
