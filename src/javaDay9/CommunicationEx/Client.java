package javaDay9.CommunicationEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String args[]) throws IOException {
		
		Socket socket = new Socket();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<클라이언트 시작>");
		System.out.println("====================================");
		
		System.out.println("[서버에 연결을 요청합니다]");
		socket.connect(new InetSocketAddress("192.168.1.29",1001));//연결
		System.out.println("[서버에 연결되었습니다]");
		
		OutputStream os = socket.getOutputStream();//발신
		Writer osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		InputStream is = socket.getInputStream();//수신
		Reader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		String str;
		
		while(true) {//사용자 발신
			str = sc.nextLine();
			
			if("/q".equals(str)) {
				System.out.println("[접속종료되었습니다]");
				break;
			}
			bw.write(str);
			bw.newLine();
			bw.flush();
			
			String reMsg = br.readLine();//서버에서 수신
		System.out.println("server : ["+reMsg+"]");
		}

		
		
		
		bw.close();
		
		

		
		
		System.out.println("====================================");
		System.out.println("<클라이언트 종료>");
		socket.close();
	}
}
