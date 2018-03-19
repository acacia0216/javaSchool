package javaDay2.indentifier;

public class Ex05 {//final로 상수 생성

	public static void main(String args[]) {
		final double PI = 3.14;
		
//		PI = 3.15538;//오류//상수는 변경불가
		
		double pi = 3.14;
		double result = pi * 5 * 5;
		System.out.println(result);
		
		pi = 3.141592;
		result = pi * 5 * 5;
		System.out.println(result);
		
	}
}
