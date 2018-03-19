package javaDay5.ex03;

public class Point {
	private int x, y;
	
	public Point() {}
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public void draw() {
		System.out.println("좌표 : "+"(x = "+this.x+" , y = "+this.y+")");
	}
	public void draw(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("좌표 : "+"(x = "+this.x+" , y = "+this.y+")");
	}
}
