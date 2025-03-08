#include <bits/stdc++.h>
using namespace std;

int main(){
    int arr[5] = {1,2,3,4,5};

    for(int i = 0 ; i < 5 && i+2; i+=2){
        
            swap(arr[i], arr[i+1]);
    }

    for(int i  = 0; i < 5 ; i++){
        cout << arr[i] << " ";
    }
}