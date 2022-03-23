package main.reader;

public class MineFieldSize {

	public final int rows;
	public final int cols;
	
	public MineFieldSize(int rows, int cols) {
		super();
		this.rows = rows;
		this.cols = cols;
	}
	
	public int calcNumberOfFields() {
		return rows * cols;
	}
}
