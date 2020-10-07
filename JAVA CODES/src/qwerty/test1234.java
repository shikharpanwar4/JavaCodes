
package qwerty;
import java.io.*;
public class test1234 {
	public static void main(String[]args) throws IOException
	{
  File file =new File("C:\\abc.txt");
  FileReader fs=new FileReader(file);
  int words=0;
  int letters=0;
  int sp=0;
  int i;
  i=fs.read();
  while(i!=-1)
  {
	  if((i>=65 && i<91) || (i>=97 && i<=122))
	  {
		  letters++;
	  }
	  else if (i==' '|| i=='\n')
	  {
		  words++;
	  }
	  else if ((i>=32 && i<=47) || (i>=58 && i<=64) ||( i>=91 && i<=96) ||(i>=123 &&i<=126))
	  {
		  sp++;
	  }
	  i=fs.read();
  }
  System.out.println(letters);
  System.out.println(sp); 
  System.out.println(words);
	}
}