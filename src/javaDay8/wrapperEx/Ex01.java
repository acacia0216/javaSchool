package javaDay8.wrapperEx;

public class Ex01 {
	public static void main(String args[]) {
		Integer a = new Integer(78);
		int b = 69;
		String c = new String("5762");
		int d;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(b+c);
		d = Integer.parseInt(c);
		System.out.println(b+d);
	}
}
