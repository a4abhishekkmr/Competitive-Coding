https://www.codechef.com/APRIL21C/problems/BOLT

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
		sc.nextLine();
		while(t-->0)
		{
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		
		double ans=a*b*c*d;
		ans=100/ans;
		double roundOff = Math.round(ans * 100.0) / 100.0;
		double given=9.58;
		if(roundOff<given)
		System.out.println("yes");
		
		else
		System.out.println("no");
	}
	}
}
