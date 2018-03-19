package javaDay7;

public class Circle extends Shape{
	private int radius;
	
	public Circle() {}
	
	public Circle(String lineColor, String fillColor) {
		super.setLineColor(lineColor);
		super.setFillColor(fillColor);
	}
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("지름:"+radius*2+" // 선 색:"+super.getLineColor()+" // 면 색:"+super.getFillColor()+" 의 원을 그렸습니다.");
	}
	
	public double area() {
		return radius*radius*PI;
	}
}
