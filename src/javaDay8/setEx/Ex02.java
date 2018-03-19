package javaDay8.setEx;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	
	public static void main(String args[]) {
		
		Set<Integer> set = new HashSet<Integer>();
		int count=0;
		while(set.size()<6)
		{
			int num = (int)(Math.random()*45)+1;
			set.add(num);
			count++;
		}
		
		int i=1;
		for(int lotto:set)
		{
			System.out.println(i+"번 : "+lotto);
			i++;
		}
		System.out.println("count : "+count);
		
	}
	
	
}
