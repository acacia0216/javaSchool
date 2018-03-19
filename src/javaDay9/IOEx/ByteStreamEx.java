package javaDay9.IOEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamEx {
	public static void main(String args[]) throws FileNotFoundException, IOException {
		
		InputStream is = new FileInputStream("D:\\javaStudy\\file\\img.jpg");
		OutputStream os = new FileOutputStream("D:\\javaStudy\\file\\byteimg1.jpg");
		
		int bData = 0;
		byte[] b = new byte[1024];
		
		
		
		System.out.println("복사시작");
		while(bData != -1)
		{
			bData = is.read(b);
			os.write(b);
		}
		System.out.println("복사 완료");
		is.close();
		os.close();
		
	}
}
