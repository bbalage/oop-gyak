package main.reader;

public class Vals {

	public final int val1;
	public final int otherval;
	
	public Vals(int thing1, int thing2) {
		super();
		this.val1 = thing1;
		this.otherval = thing2;
	}
	
	public int getHouseSize() {
		return val1 * otherval;
	}
}
