package javaDay4.random;

import java.util.Scanner;

public class EX01 {//입력받아 합계 프로그램//0입력시 종료
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요(0이면 종료) : ");
		int n, sum = 0;
		
		do
		{
			n = sc.nextInt();
			sum += n;
		}
		while(n != 0);
		sc.close();
		System.out.println("합계 : "+sum);
		System.out.println("종료");		
		
	}
}
