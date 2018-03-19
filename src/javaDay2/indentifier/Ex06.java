package javaDay2.indentifier;

public class Ex06 {//형변환
	public static void main(String args[]) {
		
		int a = 7;
		int b = 3;
		float c = 3.0f;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("a/b : "+a/b);
		System.out.println("a/c : "+a/c);//자동 형변환
		
		double dVar01 = 2 + 3.5;
		System.out.println(dVar01);
		int i = (int)12.5;//명시적 형변환
		
		double dVar02 = (double)100;
		System.out.println(dVar02);
	}
}
