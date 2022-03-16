package set2;

public class Quiz2_3 {
	
	public static void main(String[] args) {
		Vec2_3 vec = new Vec2_3(12, 11);
		System.out.println(vec);
	}
}

class Vec2_3 {
	
	private int x;
	private int y;
	
	public Vec2_3(int x, int y) {
		x = x;
		y = y;
	}
	
	@Override
	public String toString() {
		return x + " " + y;
	}
}