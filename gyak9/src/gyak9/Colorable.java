package gyak9;

import java.awt.Color;

public interface Colorable {
	
	public static final Color defaultColor = Color.RED;
	
	public Color getColor();
	public void setColor(Color color);

	public static void setDefault(Colorable colorable) {
		colorable.setColor(defaultColor);
	}
}
