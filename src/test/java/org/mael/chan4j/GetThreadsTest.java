package org.mael.chan4j;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

public class GetThreadsTest {

	@Test
	public void getThreadsByBoardAndPageNumber() {

		List<FourChanPreviewThread> previewThreads = FourChan.fromBoard("g")
				.fromPage(0).allThreads();

		assertNotNull(previewThreads);

		// Https
		previewThreads = FourChan.fromBoard("g").fromPage(0).allThreads(true);

		assertNotNull(previewThreads);

	}

	@Test
	public void getThreadCommentsFromThreads() {

		List<FourChanPreviewThread> previewThreads = FourChan.fromBoard("g")
				.fromPage(0).allThreads();

		assertNotNullComments(previewThreads);

		// Https
		previewThreads = FourChan.fromBoard("g").fromPage(0).allThreads(true);

		assertNotNullComments(previewThreads);

	}

	@Test
	public void getAllPostsFromThread() {

		FourChanPreviewThread previewThread = FourChan.fromBoard("g")
				.fromPage(0).allThreads().get(0);

		FourChanThread thread = previewThread.expand();

		assertNotNullPosts(thread);

		thread = previewThread.expand(true);

		assertNotNullPosts(thread);

	}

	public void assertNotNullPosts(FourChanThread thread) {

		assertNotNull(thread);

		assertNotNull(thread.getPosts());

		assertNotNull(thread.getPosts().get(0).getPostNumber());
	}

	public void assertNotNullComments(List<FourChanPreviewThread> previewThreads) {
		for (FourChanPreviewThread thread : previewThreads) {

			assertNotNull(thread.getPosts().get(0).getComment());

		}
	}

}
