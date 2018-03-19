package javaDay4.random;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String args[]) {
		char a[] = new char[3];
		a[0] = 'B';
		a[1] = 'I';
		a[2] = 'T';
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(a);
		
		char b[] = {'B', 'I', 'T'};
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println(b);
		
		char c[] = new char[3];
		String cc = "BIT";
		for(int i=0; i<c.length; i++)
		{
			c[i] = cc.charAt(i);
		}
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println(c);
		
		String str[] = new String[5];
		for(int i=0; i<str.length; i++)
		{
			str[i] = "a";
		}
		System.out.println(str);
	}
}
