package javaDay4.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex05 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		List a = new ArrayList();
		List b = new ArrayList();
		List c = new ArrayList();
		
		System.out.print("입력 수 :");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++)
		{
			System.out.print("제목 : ");
			a.add(sc.nextLine());
			System.out.print("저자 : ");
			b.add(sc.nextLine());
			System.out.print("출판일 : ");
			c.add(sc.nextLine());
		}
		
		System.out.println("==============");
		System.out.println("제목 | 저자 | 출판일");
		System.out.println("==============");
		for(int i=0; i<a.size(); i++)
		{
			System.out.print(a.get(i)+" ");
			System.out.print(b.get(i)+" ");
			System.out.println(c.get(i));
		}
		
	}
}
