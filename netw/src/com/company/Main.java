package com.company;
import  java.io.*;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws UnknownHostException{
        String url = "www.google.com";
        int addr[]={127,127,127,2};
        InetAddress ip= InetAddress.getByName(url);
        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());

    }
}
