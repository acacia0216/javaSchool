package javaDay8.objectEx;

public class PointApp {

	   public static void main( String[] args ) {
	        Point a = new Point(2,3);
	        Point b = new Point(2,3);
	        Point c = a;

	        System.out.println(a.hashCode());//10자리 숫자//가짜주소
	        System.out.println(a.getClass());//class 위치
	        System.out.println(a.getClass().getName());//위치
	        System.out.println(a.toString());//
	        System.out.println(a);//
	        System.out.println();
	        
	        System.out.println(b.hashCode());//10자리 숫자//가짜주소
	        System.out.println(b.getClass());//class 위치
	        System.out.println(b.getClass().getName());//위치
	        System.out.println(b.toString());//
	        System.out.println(b);//
	        System.out.println();
	        
	        System.out.println(c.hashCode());//10자리 숫자//가짜주소
	        System.out.println(c.getClass());//class 위치
	        System.out.println(c.getClass().getName());//위치
	        System.out.println(c.toString());//
	        System.out.println(c);//
	        System.out.println();
	        
	        System.out.println(a == b);//진짜 주소값 비교
	        System.out.println(a == c);
	        System.out.println(b == c);
	        System.out.println();
	        
	        System.out.println(a.equals(b));//
	        System.out.println(a.equals(c));
	        System.out.println(b.equals(c));
	        
	  }
	}