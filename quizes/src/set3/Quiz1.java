package set3;

class A {
	private String thing = "Hello";
	
	@Override
	public String toString() {
		return thing;
	}
}

class B extends A {
	public String swear() {
		return "Sh*t";
	}
}

public class Quiz1 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(((B)a).swear());
	}
}