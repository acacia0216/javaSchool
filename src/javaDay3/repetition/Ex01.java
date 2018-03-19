package javaDay3.repetition;

public class Ex01 {//반복문
	public static void main(String args[]) {
		
		for(int i=0; i<5; i++)
		{
			System.out.println("I like Java"+i);
		}
		System.out.println();
		
		int count = 0;//시작지점
		while(count < 100)//조건문이 false가 될때 탈출
		{
			System.out.println("I like Java"+count);
			count++;//탈출조건
		}
		
	}
}
