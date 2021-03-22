#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int w1,w2,x1,x2,m;
	    cin>>w1>>w2>>x1>>x2>>m;
	    int diff=w2-w1;
	    int min=x1*m;
	    int max=x2*m;
	    if(diff>=min && diff<=max)
	    {cout<<1;}
	    else
	    {cout<<0;}
	    cout<<endl;
	}
	return 0;
}
