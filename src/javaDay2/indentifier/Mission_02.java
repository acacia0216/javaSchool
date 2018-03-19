package javaDay2.indentifier;

import java.util.Scanner;

public class Mission_02 {
	public static void main(String args[]) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num>0 && num !=0 && num%2 == 0)
		{
			System.out.println("입력하신 "+num+"는 짝수입니다.");
		}
		else if(num>0 && num%2 != 0)
		{
			System.out.println("입력하신 "+num+"는 홀수입니다.");
		}
		else if(num<0)
		{
			System.out.println("음수입니다.");
		}
		else
		{
			System.out.println("혹시 0인가요?");
		}
	}
	
}
