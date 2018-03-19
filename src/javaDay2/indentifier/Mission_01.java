package javaDay2.indentifier;

import java.util.Scanner;

public class Mission_01 {
	public static void main(String args[]) {
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요 : ");
		name = sc.nextLine();
		System.out.print("나이를 입력해주세요 : ");
		age = sc.nextInt();
		System.out.println("당신의 이름은 "+name+" 이고, 당신의 나이는 "+age+"세 입니다.");
	}
}
