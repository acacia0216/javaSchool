package javaDay7.shape;

public class Triangle extends Shape implements Drawable{
	private int width;
	private int height;
	
	public Triangle() {}
	
	public Triangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.height = height;
		this.width = width;
	}

	
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

	public void draw() {
		System.out.println("lineColor:"+super.getLineColor()
						+"   fillColor:"+super.getFillColor()
						+"   가로:"+this.width
						+"   높이:"+this.height+" 의 삼각형을 그렸다.");
	}

	@Override
	public void area() {
		System.out.println("넓이 : "+width*height/2);
	}
}
