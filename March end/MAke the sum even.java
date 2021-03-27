https://www.codechef.com/LTIME94C/problems/MKSMEVN/

///>>>>
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
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		
		while(t-->0)
		{
		    int n=input.nextInt();
		    int a[]=new int[n];
		    int sum=0;
		    for(int i=0;i<n;i++)
		    {
		        a[i]=input.nextInt();
		        sum+=a[i];
		    }
		     int p=0;
		    if(sum%2==0)
		    {
		        System.out.println("0");
		    }
		   
		    
		    else{
		       int ans=0;
		        for(int i=0;i<n;i++)
		    {
		        if(a[i]%2==0 && ((a[i]+1)/2-1<=0))
		        {
		            ans=1;
		            break;
		        }
		    }
		    if(ans==1)
		         System.out.println("1");
		    else
		        System.out.println("-1");
		    }
		 
		}
	}
}
