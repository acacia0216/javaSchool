package javaDay9.IOEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp{
	public static void main(String args[]) throws IOException, NullPointerException{
		
		Reader fr = new FileReader("D:\\javaStudy\\file\\PhoneApp.txt");
		BufferedReader br = new BufferedReader(fr);
		
//		String line = "";
//		
//		while(true)
//		{
//			line = br.readLine();
//			
//			if(line == null)
//			{
//				break;
//			}
//			String[] info = line.split(",");
//			
//			String name = info[0];
//			String hp = info[1];
//			String cp = info[2];
//			
//			System.out.println("이름 : "+name);
//			System.out.println("핸드폰 : "+hp);
//			System.out.println("회사 : "+cp);
//			System.out.println();
//		}
		List<Person> al = new ArrayList<Person>();

		String line = "";
		while(true)
		{
			line = br.readLine();
			if(line == null)
			{
				break;
			}
			String Info[] =line.split(",");
			
			al.add(new Person(Info[0], Info[1], Info[2]));
		}
		
		int count = 0;
		for(Person p : al)
		{
			al.get(count).getInfo();
			count++;
		}
		System.out.println(count);
		br.close();
		
	}
}