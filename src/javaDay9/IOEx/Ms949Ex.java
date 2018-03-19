package javaDay9.IOEx;

import java.io.*;

public class Ms949Ex {
	public static void main(String args[]) throws IOException {
		
		InputStream is = new FileInputStream("D:\\javaStudy\\file\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(is, "MS949");
		BufferedReader br = new BufferedReader(isr);
		
		String line = "";
		System.out.println("시작");
		while(true)
		{
			line = br.readLine();
			if(line == null)
			{
				break;
			}
			System.out.println(line);
		}
		
		System.out.println();
		System.out.println("파일 읽기 종료");
		br.close();
	}
}
