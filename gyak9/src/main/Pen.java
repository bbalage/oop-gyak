package main;

import java.awt.Color;

import gyak9.Colorable;

public class Pen extends Product implements Colorable{

	private Color color;
	private String brand;
	
	public Pen(String brand, Color color, int price) {
		super("Pen", price, 27);
		this.color = color;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return super.toString() + " Pen [color=" + color + ", brand=" + brand + "]";
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
