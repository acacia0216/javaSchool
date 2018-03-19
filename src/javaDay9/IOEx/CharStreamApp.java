package javaDay9.IOEx;

import java.io.*;
import java.util.Scanner;

public class CharStreamApp {//하다만거
	public static void main(String args[]) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		Writer fw = new FileWriter("D:\\javaStudy\\file\\Song.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		while(sc.nextLine() != "/q")
		{
			bw.write(sc.nextLine());
			bw.newLine();
		}
		System.out.println("종료");
		
		bw.close();
		
		
		
//		Reader fr = new FileReader("D:\\javaStudy\\file\\Song.txt");
//		BufferedReader br = new BufferedReader(fr);
//		
//		String read = "";
//		while(true)
//		{
//			read = br.readLine();
//			if(read == null)
//			{
//				System.out.println();
//				System.out.println("불러오기 끝");
//				break;
//			}
//			System.out.println(read);
//		}
//		br.close();
		
	}
}
