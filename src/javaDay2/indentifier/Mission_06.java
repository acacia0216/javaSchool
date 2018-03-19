package javaDay2.indentifier;

import java.util.Scanner;

public class Mission_06 {
	public static void main(String args[]) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		num = sc.nextInt();
		
		if(num>=90)
		{
			System.out.println("A등급 입니다.");
		}
		else if(num<90 && num>=80)
		{
			System.out.println("B등급 입니다.");
		}
		else if(num>=70)
		{
			System.out.println("C등급 입니다.");
		}
		else if(num>=60)
		{
			System.out.println("D등급 입니다.");
		}
		else
		{
			System.out.println("F등급 입니다.");
		}
	}
}
