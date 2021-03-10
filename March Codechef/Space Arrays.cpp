https://www.codechef.com/MARCH21C/problems/SPACEARR

Example Input
4
4
1 2 3 3
4
1 1 3 3
5
1 2 2 1 5
3
2 2 3
Example Output
First
Second
Second
Second
Explanation
Example case 1:

If the first player increases the fourth element, the resulting sequence is (1,2,3,4). The second player loses after increasing any of the elements.
If the first player increases the second element, the resulting sequence is (1,3,3,3), and he loses because there is no valid permutation.

Soln-

#include <iostream>
#include <bits/stdc++.h> 
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	int n;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++){
	    cin>>a[i];
	}

	sort(a, a + n); 
	
	int number=0;
	int flag=0;
	
	for(int i=0;i<n;i++)
	{
	    if(i+1-a[i]<0)
            {
                flag=1;
                break;
            }
            number=number+((i+1)-a[i]);
	}
	if(flag==1)
	{
	    cout<<"Second"<<endl;
	}
	else{
	
	if(number%2!=0){
	cout<<"First"<<endl;
	}
	else
	cout<<"Second"<<endl;
	}
	}
	return 0;
}