package javaDay7.shape;

public abstract class Shape {
	public static final double PI = 3.14;
	private String lineColor;
	private String fillColor;
	
	public Shape() {}
	
	public Shape(String lineColor, String fillColor) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public abstract void draw();
	
	public abstract void area();
	
	
}
