link>>https://www.codechef.com/LTIME94C/problems/IMDB

#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int n,x;
	    cin>>n>>x;
	    int s,r,temp=0;
	    for(int i=0;i<n;i++)
	    {
	        cin>>s>>r;
	        if(r>=temp&&s<=x)
	        {
	            temp=r;
	        }
	    }
	    cout<<temp<<endl;
	}
	return 0;
}
