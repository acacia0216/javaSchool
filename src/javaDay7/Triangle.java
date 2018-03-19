package javaDay7;

public class Triangle extends Shape{
	
	public Triangle() {}
	
	public Triangle(String lineColor, String fillColor, int width, int height) {
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
		System.out.println("lineColor:"+super.getLineColor()+"   fillColor:"+super.getFillColor()+
							"   가로:"+super.getWidth()+"   높이:"+super.getHeight()+" 의 삼각형을 그렸다.");
	}
	
	public double area() {
		return super.getWidth()*super.getHeight()/2;
	}
}
