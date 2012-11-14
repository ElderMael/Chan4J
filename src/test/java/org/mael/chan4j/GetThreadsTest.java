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

		System.out.println(previewThreads);

	}

	@Test
	public void getThreadCommentsFromThreads() {

		List<FourChanPreviewThread> previewThreads = FourChan.fromBoard("g")
				.fromPage(0).allThreads();

		for (FourChanPreviewThread thread : previewThreads) {

			System.out.println(thread.getPosts().get(0).getComment());

		}

	}

	@Test
	public void getAllPostsFromThread() {

		FourChanPreviewThread previewThread = FourChan.fromBoard("g")
				.fromPage(0).allThreads().get(0);

		FourChanThread thread = previewThread.expand();

		System.out.println(thread);

	}

}
