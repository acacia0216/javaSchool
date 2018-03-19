package javaDay7.shape;

public class Circle extends Shape implements Drawable{
	private int radius;

	public Circle() {
		super();
	}

	public Circle(String lineColor, String fillColor, int radius) {
		super(lineColor, fillColor);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("선색:"+super.getLineColor()
							+"//면색:"+super.getFillColor()
							+"//반지름:"+radius+"의 원을 그렸다.");
	}

	@Override
	public void area() {
		System.out.println("넓이 : "+radius*radius*PI);
	}
	
	
}
