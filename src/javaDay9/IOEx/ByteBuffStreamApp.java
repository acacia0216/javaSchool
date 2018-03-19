package javaDay9.IOEx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteBuffStreamApp {
	public static void main(String args[]) throws IOException {
		
		InputStream in = new FileInputStream("D:\\javaStudy\\file\\img.jpg");
		BufferedInputStream br = new BufferedInputStream(in);
		OutputStream out = new FileOutputStream("D:\\javaStudy\\file\\bufferedimg.jpg");
		BufferedOutputStream bw = new BufferedOutputStream(out);
		
		int bData;
		
		System.out.println("복사시작");
		while(true)
		{
			bData = br.read();
			if(bData == -1)
			{
				break;
			}
			bw.write(bData);
		}
		System.out.println("복사끝");
		bw.close();
		br.close();
		System.exit(0);
		
	}
}
