import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Date: 2019/08/14
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class ChatClient {

	BufferedReader reader;
	PrintWriter writer;
	Socket sock;
	String string = "";
	
	public class IncomingReader implements Runnable{
		
		public void run() {
			
			String message;
			
			try {
				
				while((message = reader.readLine()) != null) {
					
					System.out.println(message);
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	private void setUpNetworking(String ip, int port) {
		
		try {
			
			sock = new Socket(ip, port);
			InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
			reader = new BufferedReader(streamReader);
			writer = new PrintWriter(sock.getOutputStream());
			System.out.println("networking established");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void go() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Input ip address and port (xxx.xxx.xxx.xxx:xxxx): ");
		String[] ip_port = br.readLine().split(":");
		
		setUpNetworking(ip_port[0], Integer.parseInt(ip_port[1]));
		
		Thread readerThread = new Thread(new IncomingReader());
		readerThread.start();
		
		System.out.println("Begin Chat...");
		writer.println(string);
		writer.flush();
		
		while(!string.equals("exit")) {
			
			string = br.readLine();
			writer.println(string);
			writer.flush();
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChatClient client = new ChatClient();
		client.go();
	}
}
