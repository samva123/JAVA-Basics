#include <bits/stdc++.h>
using namespace std;

void checkArray(vector<int>& arr) {
    int n = arr.size();
    for (int i = 0; i < arr.size(); ++i) {
        if (arr[i] == 0 && arr[i - 1] == 1 && arr[i + 1] == 1) {
            cout << "NO" << endl;
            return;
        }
    }
    cout << "YES" << endl;
}

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<int> arr(n - 2); // Initialize array with 1s
        for (int i = 0; i < arr.size(); ++i) {
            cin >> arr[i];
        }
        
        checkArray(arr);
    }
    return 0;
}
