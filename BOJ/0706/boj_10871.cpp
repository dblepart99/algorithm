#include <bits/stdc++.h>

using namespace std;

int main(){
    
    int N, target, tmp;
    cin >> N >> target;
    
    for(int i = 0; i < N; i++){
        cin >> tmp;
        if(tmp < target){
            cout << tmp << " ";
        }
    }
    
}
