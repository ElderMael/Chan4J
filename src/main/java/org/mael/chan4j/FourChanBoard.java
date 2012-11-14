package org.mael.chan4j;

public class FourChanBoard {

	private String boardName;

	public FourChanBoard() {

	}

	public FourChanBoard(String name) {

		this.boardName = name;

	}

	public FourChanPage fromPage(int pageNumber) {

		return new FourChanPage(this, pageNumber);
	}

	public String getName() {
		return boardName;
	}

	public void setName(String boardName) {
		this.boardName = boardName;
	}

}
