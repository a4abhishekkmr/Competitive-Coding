https://www.codechef.com/LTIME94C/problems/LUNCHTIM


#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	for(int i=0;i<t;i++){
	    int n;
	    cin>>n;
	    int a[n];
	    for(int j=0;j<n;j++){
	        cin>>a[j];
	    }
	    for(int j=0;j<n;j++){
	        int count=0;
	        
	        for(int k=j-1;k>=0;k--){
	            if(a[k]>a[j]){
	                break;
	            }
	            else if(a[k]==a[j]){
	                count++;
	            }
	        }
	        
	        for(int k=j+1;k<n;k++){
	            if(a[k]>a[j]){
	                break;
	            }
	            else if(a[k]==a[j]){
	                count++;
	            }
	        }
	        
	        cout<<count<<" ";
	    }
	}
	return 0;
}