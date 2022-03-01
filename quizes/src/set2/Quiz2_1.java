package set2;

public class Quiz2_1 {

	public static void main(String[] args) {
		Point point = new Point();
		point.x = 10;
		point.y = point.x + 3;
		System.out.println("x: " + point.x + "; y: " + point.y);
	}

}

class Point {
	int x;
	int y;
}