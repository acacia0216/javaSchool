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
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.1.29",1001));
		
		System.out.println("<서버시작>");
		System.out.println("====================================");
		System.out.println("[연결을 기다리고 있습니다]");
		Socket socket = serverSocket.accept();//연결되면 소켓 객체 생성
//		Thread.sleep(1000);
		System.out.println("[클라이언트가 연결되었습니다]");
		
		InputStream is = socket.getInputStream();//수신
		Reader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = socket.getOutputStream();//발신
		Writer osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		String msg;
		
		while(true)
		{
			msg = br.readLine();
			if(msg == null)
			{
				System.out.println("클라이언트 접속 종료");
				break;
			}
			System.out.println("받은 메시지 : " +msg);
			bw.write(msg);
			bw.newLine();
			bw.flush();
		}
		
		
		bw.close();
		
		System.out.println("====================================");
		System.out.println("<서버종료>");
		
		serverSocket.close();
	}

}
