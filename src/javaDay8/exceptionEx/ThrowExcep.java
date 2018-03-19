package javaDay8.exceptionEx;

import java.io.IOException;

public class ThrowExcep {
	public void excuteExcept() throws IOException {
		
		System.out.println("강제 예외발생");
		throw new IOException();
	}
}
