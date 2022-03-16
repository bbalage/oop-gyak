package set2;

public class Quiz2_4 {
	
	public static void main(String[] args) {
		Vec2_4 vec = new Vec2_4(12, 11);
		Vec2_4 vec2 = new Vec2_4();
		System.out.println(vec);
	}
}

class Vec2_4 {
	
	private int x;
	private int y;
	
	public Vec2_4(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return x + " " + y;
	}
}