package javaDay8.genericEx;

public class MyListApp {
	public static void main(String args[]) {
		
		Point p1 = new Point(2,2);
		Point p2 = new Point(3,3);
		
		MyList<Point> myList = new MyList<Point>();
		myList.add(p1);
		myList.add(p2);
		
		System.out.println(myList.getget(0));
		System.out.println(myList.getget(1));
		
		System.out.println("point객체 현재 들어있는 갯수 : "+myList.size());
		
		
		MyList<Circle> circleList = new MyList<Circle>();
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(7);
		Circle c3 = new Circle(1);
		Circle c4 = new Circle(8);
		Circle c5 = new Circle(9);
		
		circleList.add(c1);
		circleList.add(c2);
		circleList.add(c3);
		circleList.add(c4);
		circleList.add(c5);
		
		System.out.println(circleList.getget(0));
		System.out.println(circleList.getget(1));
		System.out.println(circleList.getget(2));
		
		System.out.println("circle객체 현재 들어있는 갯수  : "+circleList.size());
		
	}
}
