#include <bits/stdc++.h>

using namespace std;
using ll = long long;


int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);
  cout.tie(0);
  int T, a, b;
  cin >> T;
  for(int i = 0; i < T; i++){
    cin >> a >> b;
    cout <<"Case #"<< i+1 <<": " << a << " + " << b <<" = "<< a+b << '\n';
  }

  return 0;
}