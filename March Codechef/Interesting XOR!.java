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
			Scanner sc = new Scanner(System.in);
		long t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
		    long n=sc.nextInt();
		    //to find the d
 
        // calculate the position of the last set bit of `n`
             long d1 = (long)(Math.log(n) /  Math.log(2)); 
             
             long d=d1+1;
             
             long A1=(long)Math.pow(2,d1);
             long A=A1-1;
             
             
             long B=(A^n);
             //System.out.println(A);
             //System.out.println(B);
             System.out.println(A*B);
             t--;
	}
}
}
