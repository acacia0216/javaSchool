package javaDay7;

public class Ractangle extends Shape{
	
	public Ractangle() {}
	
	public Ractangle(String lineColor, String fillColor, int width, int height) {
		super.setLineColor(lineColor);
		super.setFillColor(fillColor);
		super.setWidth(width);
		super.setHeight(height);
	}
	
	public int getWidth() {
		return super.getWidth();
	}

	public void setWidth(int width) {
		super.setWidth(width);
	}

	public int getHeight() {
		return super.getHeight();
	}

	public void setHeight(int height) {
		super.setHeight(height);
	}
	
	public void draw() {
		System.out.println("사각형 생성 시작");
		System.out.print("선색 : "+super.getLineColor());
		System.out.print(" // 면색 : "+super.getFillColor());
		System.out.print(" // width : "+super.getWidth());
		System.out.println(" // height : "+super.getHeight());
		System.out.println("사각형 생성 완료");
	}
	
	public double area() {
		return super.getHeight()*super.getWidth();
	}
	
}
