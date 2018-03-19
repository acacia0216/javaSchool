package javaDay8.stringEx;

public class Ex01 {
	public static void main(String args[]) {
		
	String str1; 
	String str2, str3;  // String 클래스변수 str1, str2, str3 선언
		
	str1 = "abc";       // str1은 생성된 String 클래스의 객체(Object)를 가리킴
	str2 = "cde";      // str2은 생성된 String 클래스의 객체(Object)를 가리킴
	str3 = str2;         // str3에 str2의 값 할당

	str2 = str1.toUpperCase();
	
	String str4 = str2.concat( "??" ); 
	String str5 = "!".concat(str2).concat( "@" );
	String str6 = str2.toLowerCase();
	String str7 = str2.valueOf(str1);

	System.out.println("str1: " + str1); //abc
	System.out.println("str2: " + str2); //ABC
	System.out.println("str4: " + str4); //ABC??
	System.out.println("str5: " + str5); //!ABC@
	
	System.out.println("str6 : "+ str6);
	System.out.println(str7);

	}
}
