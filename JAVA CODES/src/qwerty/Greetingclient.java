package qwerty;
import java.net.*;
import java.io.*;

public class Greetingclient  

{
	public static void main(String [] args) throws UnknownHostException  
	{
	InetAddress ip=InetAddress.getByName("www.youtube.com"); 
	try
	 {
		System.out.println("Host Name: "+ip.getHostName());  
	    System.out.println("IP Address: "+ip.getHostAddress());  
	}
	catch(Exception e){System.out.println(e);}  
    }
}
