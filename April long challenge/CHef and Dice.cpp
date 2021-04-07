https://www.codechef.com/APRIL21C/problems/SDICE

#include <iostream>
using namespace std;

int main() {
	// your code goes here
	long long t;
	cin>>t;
	while(t--)
	{
	     long long n;
	     cin>>n;
		    if(n<=4)
		    {
		        if(n==1) cout<<20<<endl;
		        if(n==2) cout<<36<<endl;
		        if(n==3) cout<<51<<endl;
		        if(n==4) cout<<60<<endl;
		    }
		    else{
		    long long x=n/4;
		    long long y=n%4;
		    
		  //  long m=0;
		  //  if(x>1)//obvio
		  //  m=x-1;
		    
		    long add=0;
		    if(y==1) add=16;
		    if(y==2) add=12+16;
		    if(y==3) add=11+12+16;
		    if(y==0) add=0;
		    
		    long ans=60+((x-1)*44)+add;
		    
		    cout<<ans<<endl;
		    }
	}
	return 0;
}
