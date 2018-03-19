package javaDay8.exceptionEx;

import java.io.IOException;

public class ThrowExcepApp {
	public static void main(String args[]) throws IOException{
		
		ThrowExcep excep = new ThrowExcep();
		
		try
		{
			excep.excuteExcept();
		}
		catch (IOException e)
		{
			System.out.println(e);
			System.out.println("파일을 생성합니다.");
		}
	}
}
