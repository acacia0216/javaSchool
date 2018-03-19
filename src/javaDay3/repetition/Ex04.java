package javaDay3.repetition;

public class Ex04 {//2의배수와 3의배수를 제외한 수 출력
	public static void main(String args[]) {
		int n = 20;
		
		for(int i=1; i<=n; i++)
		{
			if(i%2 != 0 && i%3 != 0)
			{
				System.out.println(i);
			}
		}
	}
}
