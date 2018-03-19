package javaDay5.ex03;

public class PointApp {
	public static void main(String args[]) {
		
		Point point = new Point();
		
		point.setX(4);
		point.setY(3);
		
		System.out.println(point.getX()+","+point.getY());
		System.out.println();
		
		point.draw();
		point.draw(2,3);
	}
}
