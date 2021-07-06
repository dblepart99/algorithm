#include <iostream>

using namespace std;

int main(){
    
    int arr[3];
    int tmp;
    
    for(int i = 0; i < 3; i++){
        cin >> arr[i];
    }
    
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 2 - i; j++){
            if(arr[j] > arr[j+1]){
                tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
    
    for(int i = 0; i < 3; i++){
        cout << arr[i] << " ";
    }
    
}
