package javaDay3.repetition;

import java.util.Scanner;

public class Ex02 {//while문 구구단
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int dan = 2;
		while(dan<10)
		{
			System.out.println(dan+"단");
			while(i<10)
			{
				System.out.println(dan+" * "+i+" = "+dan*i);
				i++;
			}
			System.out.println();
			dan++;
			i=1;
		}
	}
}
