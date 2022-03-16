package set2;

public class Quiz2_5 {

	public static void main(String[] args) {
		Vec2_5 vec = new Vec2_5(12, 11);
		Vec2_5 vec2 = new Vec2_5(1, 1);
		vec.add(vec2);
		System.out.println(vec);
	}
}

class Vec2_5 {
	
	private int x;
	private int y;
	
	public Vec2_5(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Vec2_5() {
		this(0,0);
	}
	
	public void add(Vec2_5 vec) {
		this.x += vec.x;
		this.y += vec.y;
	}
	
	@Override
	public String toString() {
		return x + " " + y;
	}

}