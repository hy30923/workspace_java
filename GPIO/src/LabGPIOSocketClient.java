import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * Date: 2019/08/14
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class LabGPIOSocketClient {
	
	public void connect(String ip, int port) throws IOException {
		
		try {
				Socket sock = new Socket(ip, port);
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
				
			while(true) {	
			
				writer.println(console.readLine());	
				writer.flush();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("disconnected...");
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		LabGPIOSocketClient client = new LabGPIOSocketClient();
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Input ip address and port (xxx.xxx.xxx.xxx:xxxx): ");
		String[] ip_port = console.readLine().split(":");
		client.connect(ip_port[0], Integer.parseInt(ip_port[1]));
	}
}
