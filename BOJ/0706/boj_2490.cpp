#include <bits/stdc++.h>
using namespace std;

int main(){
    
    int a;
    int cnt = 0;
    for(int i = 0; i < 3; i++){
        cnt = 0;
        for(int j = 0; j < 4; j++){
            cin >> a;
            if(a==0){
                cnt++;
            }
        }
        if(cnt == 1){
            cout << "A" <<"\n";
            continue;
        }
        if(cnt == 2){
            cout << "B"<<"\n";
            continue;
        }
        if(cnt == 3){
            cout << "C"<<"\n";
            continue;
        }
        if(cnt == 4){
            cout << "D"<<"\n";
            continue;
        }else{
            cout << "E"<<"\n";
            continue;
        }
    
    }
}
