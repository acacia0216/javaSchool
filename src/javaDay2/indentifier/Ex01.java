package javaDay2.indentifier;

public class Ex01 {//변수 선언, 초기화 //데이터형 크기
	public static void main(String args[]) {
		
		int myAge;
		myAge = 25;
		
		System.out.println("나이 : "+myAge);
		
		
		/*int var01;
		int var02;
		int var03;
		
		int var04, var05, var06;
		
		int var07 = 10;
		int var08 = 20;
		int var09 = 30;
		*/
		int var10 = 10, var11 = 20, var12 = 30;
		
		System.out.println(var10);
		System.out.println(var11);
		System.out.println(var12);
		long var001 = 2334124672323578L;
		System.out.println(var001);
		System.out.println();
		System.out.println("데이터형 크기");
		System.out.println("char : "+Character.MIN_VALUE+" ~ "+Character.MAX_VALUE);
		System.out.println("byte : "+Byte.MIN_VALUE+" ~ "+Byte.MAX_VALUE);
		System.out.println("short : "+Short.MIN_VALUE+" ~ "+Short.MAX_VALUE);
		System.out.println("int : "+Integer.MIN_VALUE+" ~ "+Integer.MAX_VALUE);
		System.out.println("long : "+Long.MIN_VALUE+" ~ "+Long.MAX_VALUE);
		System.out.println("float : "+Float.MIN_VALUE+" ~ "+Float.MAX_VALUE);
		System.out.println("double : "+Double.MIN_VALUE+" ~ "+Double.MAX_VALUE);
		
	}
}
