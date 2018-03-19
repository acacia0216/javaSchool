package javaDay2.indentifier;

import java.util.Scanner;

public class Mission_05 {//무한루프, continue, break
	public static void main(String args[]) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<2; i++) 
		{
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num == 0)
			{
				System.out.println("종료");
				break;
			}
			
			else if(num%3 == 0)
			{
				System.out.println(num+"은 3의 배수입니다.");
				System.out.println();
				i--;
			}
			
			else
			{
				System.out.println(num+"은 3의 배수가 아닙니다.");
				System.out.println();
				i--;
			}
//			continue;
		}
	}
}
