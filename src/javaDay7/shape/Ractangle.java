package javaDay7.shape;

public class Ractangle extends Shape implements Drawable{
	private int width;
	private int height;
	
	public Ractangle() {}
	
	public Ractangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
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
		System.out.println("선색 : "+super.getLineColor()
		+" // 면색 : "+super.getFillColor()
		+" // width : "+this.getWidth()
		+" // height : "+this.getHeight()
		+"의 사각형을 그렸다.");
	}

	@Override
	public void area() {
		System.out.println("넓이 : "+width*height);
	}
	
}
