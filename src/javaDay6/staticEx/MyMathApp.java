package javaDay6.staticEx;

public class MyMathApp {
	public static void main(String args[]) {
		//instance
		MyMath mm = new MyMath();
		
		System.out.println(mm.plus(1, 2));
		System.out.println(mm.plus(2.5, 4.3));
		
		int r01 = mm.plus(6, 4);
		double r02 = mm.plus(4.7, 34.6);
		System.out.println(r01);
		System.out.println(r02);
		
		//static
		int r03 = MyMath.plus(4, 9);
		System.out.println(r03);
		double r04 = MyMath.plus(4.7, 3.6);
		System.out.println(r04);
		
		double r05 = MyMath.area(7);
		System.out.println(r05);
		
	}
}
