package qwerty;

public class plswork {

public float work(int i,detective[] d,int a,int b)
{float sum;
 sum=d[i].p;
     sum=slave(i,i+1,b-1,d,a,sum);	
 return sum;
}

float slave(int i,int point,int slctd,detective[] d,int a,float sum)
{  
	if(point>=a)
	{
		if(slctd>0)
			return 999999999;
		else 
			return sum;
	}
	if(slctd==0)
	{
		return sum;
	}
   
   float s1,s2;
   float p1=d[i].p*(float)(d[point].s/(float)d[i].s);
     if(d[point].p>p1)
     {s1=sum+d[point].p;}
     else
    	s1=sum+p1;
	 //adding element
     s1=slave(i,point+1,slctd-1,d,a,s1);
     //not adding
     s2=slave(i,point+1,slctd,d,a,sum);
     
     if(s1<s2)
    	 return s1;
     else
    	 return s2;
}

}