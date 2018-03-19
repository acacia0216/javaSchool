package javaDay2.indentifier;

import java.util.Scanner;

public class Ex09 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		
		if(point>0)
		{
			System.out.println("양수입니다.");
		}
		else if(point<0)
		{
			System.out.println("음수입니다.");
		}
		else
		{
			System.out.println("0입니다.");
		}
	}
}
