https://www.codechef.com/APRIL21C/problems/SSCRIPT


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		long t = sc.nextInt();
		
		while(t-->0)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    sc.nextLine();
		    String str=sc.nextLine();
		    //string to character wise
		    int max=0,count=0;
		    for(int i=0;i<a;i++)
		    {
		        
		        if(str.charAt(i)=='*')
		        {count++;
		            
		      if(count>max)
		        max=count;
		        }
		        
		        
		        else{
		            count=0;
		        }
		        
		    }
		    if(max>=b)
		    System.out.println("yes");
		    else
		    System.out.println("no");
		}
		    
	}
}
