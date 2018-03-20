package javaDay10.chatEx;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
public static void main(String[] args) throws IOException, InterruptedException {
		
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.1.29",1001));
		
		System.out.println("<서버시작>");
		System.out.println("====================================");
		System.out.println("[연결을 기다리고 있습니다]");
		
		while(true)
		{
			Socket socket = serverSocket.accept();//연결되면 소켓 객체 생성
			Thread thread = new ServerThread(socket);
			thread.start();
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
			if(a == "/q")
				break;
		}
		
		System.out.println("====================================");
		System.out.println("<서버종료>");
		
		serverSocket.close();
	}
}
