package javaDay8.stringEx;

import java.util.StringTokenizer;

public class Ex02 {
	public static void main(String args[]) {
		
		String a = new String(" abcd /");
		String b = new String(",efg /");
		String c = a+b;
		
//		System.out.println(a.concat(b));
//		System.out.println(a.trim());
//		
//		a = a.concat(b);
//		System.out.println(a);
		
//		String d[] = a.split(" ");
//		
//		for(int i=0; i<d.length; i++)
//			System.out.println(d[i]);
		
		System.out.println(c);
		
		String result="";
		 StringTokenizer tokens = new StringTokenizer(c, " ."); 

		     while(tokens.hasMoreTokens()) { 

		        result += tokens.nextToken() + "?"; 

		     } 
		     System.out.println(result);

		
	}
}
