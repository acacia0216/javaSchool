package javaDay9.IOEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class InoutEx {
	public static void main(String args[]) throws IOException {
		
		Reader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String line = br.readLine();
		
//		System.out.println(line);
		
		Writer osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write(line);
		
		
		br.close();
		bw.close();
	}
}
