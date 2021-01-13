/****************
 * package test_package;
import java.io.*;
import java.net.*;
public class Clint {
	public static void main(String[]args) {
		try {
			Socket clintSocket=new Socket("localhost",8979);
			DataOutputStream output=new DataOutputStream(clintSocket.getOutputStream());
			output.writeUTF("hello world");
			
			
			
			
		
			
			
			clintSocket.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
*****************///==================================================================
/*
package test_package;
import java.io.*;
import java.net.*;
public class Server {
	public static void main(String[]args) {
		try {
			
			//====================================
			ServerSocket serverSocket=new ServerSocket(8979);
			System.out.println("wating for clint connection...");
			Socket connectionSocket=serverSocket.accept();
			System.out.println("clint connected");
		   /************//*
			DataInputStream input=new DataInputStream(connectionSocket.getInputStream());
			String message=input.readUTF();
			System.out.println(message);
			serverSocket.close();
			//====================================
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
*/
/*//---------------------------------------------------------------------------------

*****************///==================================================================

/*//---------------------------------------------------------------------------------

*****************///==================================================================

/*//---------------------------------------------------------------------------------

*****************///==================================================================