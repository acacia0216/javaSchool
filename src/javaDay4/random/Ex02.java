package javaDay4.random;

public class Ex02 {
	public static void main(String args[]) {
		
		for(int i=0; i<6; i++)
		{
			int n = (int)(Math.random()*45)+1;
			System.out.print(n+" ");
		}
		
	}
}
