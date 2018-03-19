package javaDay3.repetition;

import java.util.Scanner;

public class Ex05 {//별삼각형그리기
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int input;
		
		System.out.print("몇줄 그릴까요 : ");
		input = sc.nextInt();
		
		for(int i=0; i<input; i++)
		{
			for(int j=0; j<i+1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
