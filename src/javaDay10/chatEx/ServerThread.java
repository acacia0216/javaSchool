package javaDay10.chatEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class ServerThread extends Thread {
	
	private Socket socket;

	public ServerThread(Socket socket) {
		super();
		this.socket = socket;
	}
	
	public void run() {
		try
		{
			
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
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
			
		
	}
	
	
}
