package qwerty;
import java.util.Scanner;
public class driver {
public static void main(String args[])
{//System.out.println("hello");
 int a,b;
 Scanner scn=new Scanner(System.in);
 //input
 a=scn.nextInt();
 b=scn.nextInt();
 
 int temp1[][]=new int[a][2];
 detective[] d = new detective[a];
 for(int i=0;i<a;i++)
  {temp1[i][0]=scn.nextInt();}
 //System.out.println("\n taken input line1 ");
 for(int i=0;i<a;i++)
  {temp1[i][1]=scn.nextInt();}
// System.out.println("\n taken input line2 ");
 for(int i=0;i<a;i++)
  {d[i]=new detective(temp1[i][0],temp1[i][1]);}
 //ratio of skill to money 
for(int i=0;i<a;i++)
{d[i].r=(float)d[i].s/(float)d[i].p;}

//sorting the detectives on the ratio
quicksort q=new quicksort();
q.sort(d,0,a-1);

//finding minimum values for each element
// System.out.println("\n calling plswork ");
float[] s=new float[a-b+2];
plswork p=new plswork();
for(int i=0;i<(a-b+1);i++)
   {s[i]=p.work(i,d,a,b);}


//picking out the smallest element
float smol=s[0];
for(int i=0;i<a-b+1;i++)
  {if(smol>s[i])
      smol=s[i];	  
  System.out.println(s[i]);
  }

//ceiling function
for(int i=0;;i++)
  {if(i>=smol)
     {System.out.println(i);break;}	  
  }
scn.close();
}
}