package tmp;

public class Temp {

	public static void main(String[] args) {
		
	}

}

class Base {
	int x;
	int y;
	
}

class Derived extends Base {
	
	public Derived() {
		super();
	}
	
	public void print() {
		System.out.println(super.x);
	}
}
