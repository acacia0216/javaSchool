package javaDay10.threadEx;

public class MultiThread {
	public static void main(String args[]) throws InterruptedException {
		
		Thread thread1 = new DigitThread();
		Thread thread2 = new DigitThread();
		Thread thread3 = new AlpabetThread();
		
		thread1.start();
		thread3.start();
		Thread.sleep(1111);
		thread2.start();
		
	}
}
