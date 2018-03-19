package javaDay7;

public abstract class Shape {
	public static final double PI = 3.14;
	private int width;
	private int height;
	private String lineColor;
	private String fillColor;
	
	public Shape() {}
	

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
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
	
	public abstract double area();
		
	  
	
}
