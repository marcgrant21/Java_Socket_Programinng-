package com.soc;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ScoClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		String ip="localhost";
		int port =  9999;
		
		Socket s = new Socket(ip,port);
		
		String str = "C: Hello";
		OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
		PrintWriter out = new PrintWriter(os);
		out.println(str);
		os.flush();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str1 = br.readLine(); 
		System.out.println("C: Data from Server "+ str1);
		
	}

}
