package javaDay4.random;

import java.util.ArrayList;

public class Ex04 {
	public static void main(String args[]) {
		
		int leftArray[] = new int[] {10, 20, 30};
		int rightArray[] = new int[] {10, 20, 30};
		
		for(int i=0; i<leftArray.length; i++)
		{
			if(leftArray[i] == rightArray[i])
				System.out.println("ok");
			else if(leftArray[i] != rightArray[i])
				System.out.println("두 배열의 크기가 다릅니다.");
				
			else
				{
				for(int j=0; j<leftArray.length; j++)
				{
					System.out.println(j+"번째 값이 다릅니다.");
				}
				}
		}
}
}
