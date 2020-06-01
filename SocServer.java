package com.soc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("S: Server is online");
		ServerSocket ss = new ServerSocket(9999);
		System.out.println("S: Server is waiting for client request");
		Socket s = ss.accept();
		System.out.println("S: Client connected.");
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = br.readLine(); 
		
		System.out.println("S: Client data: "+ str);
		
		String str1="Wah gwan";
		OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
		PrintWriter out = new PrintWriter(os);
		out.println(str1);
		out.flush();
		System.out.println("S: Data sent from server to Client.");

	}

}
