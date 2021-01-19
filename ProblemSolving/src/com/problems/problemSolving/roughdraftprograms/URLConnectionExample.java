package com.problems.problemSolving.roughdraftprograms;
import java.io.*;  
import java.net.*;  
public class URLConnectionExample{  
public static void main(String[] args){  
try{  
InetAddress ip=InetAddress.getByName("www.fcebook.com");  
  
System.out.println("Host Name: "+ip.getHostName());  
System.out.println("IP Address: "+ip.getHostAddress());  
}catch(Exception e){System.out.println(e);}  
}  
}  