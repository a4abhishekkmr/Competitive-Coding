#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n,h,x;
	cin>>n>>h>>x;
	int a[n];
	for(int i=0;i<n;i++)
	{
	    cin>>a[i];
	}
	int flag=0;
	for(int i=0;i<n;i++)
	{
	    if(h<=(x+a[i]))
	    {
	      flag=1;  
	    }
	}
	if(flag==1) cout<<"YES";
	else cout<<"NO";

	return 0;
}
