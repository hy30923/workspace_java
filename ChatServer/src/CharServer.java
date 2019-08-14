import java.io.*;
import java.net.*;
import java.util.*;

/*
 * Date: 2019/08/14
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class CharServer {

	ArrayList<PrintWriter> clientOutputStreams;
	
	static int port;
	
	public class ClientHandler implements Runnable{
		
		BufferedReader reader;
		Socket sock;
		
		public ClientHandler(Socket clientSocket) {
			
			try {
				
				sock = clientSocket;
				InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
				reader = new BufferedReader(isReader);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		public void run() {
			
			String message;
			
			try {
				
				while((message = reader.readLine()) != null) {
					
					System.out.println(message);
					tellEveryOne(message);
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public void tellEveryOne(String message) {
		
		Iterator it = clientOutputStreams.iterator();
		while(it.hasNext()) {
			
			try {
				
				PrintWriter writer = (PrintWriter) it.next();
				writer.println("guest" + clientOutputStreams.indexOf(writer) + ": " + message);
				writer.flush();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public void go() {
		
		clientOutputStreams = new ArrayList<PrintWriter>();
		try {
			
			ServerSocket serverSock = new ServerSocket(port);
			System.out.println("Server on, port " + port + " open...");
			
			while(true) {
				
				Socket clientSocket = serverSock.accept();
				PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
				clientOutputStreams.add(writer);
				writer.println("Welcome guest" + clientOutputStreams.indexOf(writer));
				Thread t = new Thread(new ClientHandler(clientSocket));
				t.start();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input open port: ");
		port = Integer.parseInt(br.readLine());
		new CharServer().go();
	}

}
