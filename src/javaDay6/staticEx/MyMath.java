package javaDay6.staticEx;

public class MyMath {
	static final double PI =  3.14159265358979323846264338327950288;
	
	public static int plus(int a, int b) {
		return a+b;
	}
	public static double plus(double a, double b) {
		return a+b;
	}
	public static double area(int radius) {
		return radius*radius*PI;
	}
}
