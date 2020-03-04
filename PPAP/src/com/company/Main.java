package com.company;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
	    File f = new File("C:\\My Files\\abc.txt");
	    FileReader fr = new FileReader(f);
	    int countw =0;
	    int countl=0;
	    int countc=0;
	    int i=fr.read();
	    while(i!=-1){
	        if(i==' '||i=='\n'){
                countw++;
	        }
	        if((i>=65 && i<=91)||(i>=97&&i<=122)){
	        	countl++;
			}
	        if((i>32&&i<=47)||(i>=58&&i<=64)||(i>=91&&i<=96)||(i>=123&&i<=126)){
	        	countc++;
			}

			i=fr.read();
        }
        System.out.println("words: "+(countw) +" letters: " +(countl) +" special characters: " +(countc));
		File f1 = new File("C:\\My Files\\bcd.txt");
	    FileWriter fw = new FileWriter(f1);
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.write("Words: " +countw);
	    bw.newLine();
		bw.write("Letters: " +countl);
		bw.newLine();
		bw.write("Special Characters: " +countc);
		bw.newLine();
		bw.flush();
		bw.close();
	    fr.close();
    }
}
