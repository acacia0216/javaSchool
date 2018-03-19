package javaDay3.repetition;

import java.util.Scanner;

public class Ex03 {//for문 구구단
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		for(int dan=2; dan<10; dan++)
		{
			System.out.println(dan+"단");
			for(int j=1; j<10; j++)
			{
				System.out.println(dan+" * "+j+" = "+dan*j);
			}
			System.out.println();
		}
	}
}
