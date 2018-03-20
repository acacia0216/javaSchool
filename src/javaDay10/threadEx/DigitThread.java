package javaDay10.threadEx;

public class DigitThread extends Thread {
	
	public void run() {
		for(int cnt=0; cnt<10; cnt++)
		{
			System.out.println(cnt);
			try {
				Thread.sleep(1234);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
