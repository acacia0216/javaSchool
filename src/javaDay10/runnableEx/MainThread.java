package javaDay10.runnableEx;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread1 = new Thread(new DigitThread());
		Thread thread2 = new Thread(new DigitThread());
		Thread thread3 = new Thread(new AlpabetThread());
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		for(char ch='A'; ch<='Z'; ch++)
		{
			System.out.println(ch);
			Thread.sleep(1000);
		}
	}

}
