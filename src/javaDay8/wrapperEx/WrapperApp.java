package javaDay8.wrapperEx;

public class WrapperApp {
	public static void main(String args[]) {
		
		Integer i = new Integer(10);
		Short s = new Short((short)3);
		Long l = new Long(5);
		Byte b = new Byte((byte)1);
		Float f = new Float(0.24);
		Double d = new Double(3.14);
//		Charactor c = new Charactor('c');
		Boolean bl = new Boolean("true");
		
		Integer result = new Integer(10) + new Integer(3);
		System.out.println(result);
		
		Integer i01 = 10;
		int r01 = i01;
		System.out.println(r01);
	
		System.out.println(i01.valueOf(s));
		
		System.out.println(r01 + 123);
		String str =String.valueOf(r01);
		System.out.println(str + 123);
	}
}
