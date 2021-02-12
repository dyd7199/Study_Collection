package socketProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client_01 {

	public static void main(String[] args) {
		Socket 				socket 	= null;
		DataInputStream 	input 	= null;
		DataOutputStream 	out 	= null;

		try {
			socket = new Socket("localhost",8000);
			System.out.println("Connected");

			input = new DataInputStream(System.in);

			out = new DataOutputStream(socket.getOutputStream());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
