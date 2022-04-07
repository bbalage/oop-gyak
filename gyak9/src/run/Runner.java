package run;

import java.awt.Color;

import gyak9.Colorable;
import main.ColoredPoint;
import main.Pen;
import main.Point;

public class Runner {

	public static void main(String[] args) {
		Colorable colorable1 = new ColoredPoint(1, 2, Color.BLUE);
		System.out.println(colorable1);
		
		Colorable colorable2 = new Pen("Rotring", Color.BLACK, 2000);
		System.out.println(colorable2);
		
		Colorable.setDefault(colorable2);
		System.out.println(colorable2);
	}

}
