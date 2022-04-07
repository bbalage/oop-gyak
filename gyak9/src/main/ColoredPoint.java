package main;

import java.awt.Color;

import gyak9.Colorable;

public class ColoredPoint extends Point implements Colorable {

	private Color color;
	
	public ColoredPoint() {
		this(0, 0, Colorable.defaultColor);
	}

	public ColoredPoint(Color color) {
		this(0, 0, color);
	}
	
	public ColoredPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "ColoredPoint [color=" + color + ", x=" + x + ", y=" + y + "]";
	}

	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
	}
}
