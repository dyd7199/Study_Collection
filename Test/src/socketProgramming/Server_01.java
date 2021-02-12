package socketProgramming;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_01 {
	public static void main(String[] args) {
		Socket socket 		= null;
		ServerSocket server = null;
		DataInputStream in 	= null;

		try {
			server = new ServerSocket(8000);
			System.out.println("Server stared");

			System.out.println("Waiting for a client...");
			socket = server.accept();	// server listening
			System.out.println("Client accepted");
			
			String line = "";
			
			while(!line.equals("Over")) {
				
			}


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}




