import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Date: 2019/08/13
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Server {

	public void go(int port) {
		
		try {
			
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("server on... port " + port + " open...");
			while(true) {
				
				Socket sock = serverSocket.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				BufferedReader reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				
				String str = "connected...";
				writer.println(str);
				writer.flush();
				
				str = "please input message";
				writer.println(str);
				writer.flush();
				
				while(!str.equals("exit")) {
					
					str = reader.readLine();
					System.out.println(str);
				}
				
				System.out.println("disconnect...");
				sock.close();
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Server server = new Server();
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input open port: ");
		int port = Integer.parseInt(console.readLine());
		server.go(port);
	}

}
