import java.io.*;

public class boj11047 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sarr = br.readLine().split(" ");

        int N = Integer.parseInt(sarr[0]);
        int target = Integer.parseInt(sarr[1]);
        int[] coin = new int[N];
        int cnt = 0;

        for(int i = 0; i < N; i++){
            coin[N-i-1] = Integer.parseInt(br.readLine());

        }

        for(int i = 0; i < N; i++){
            if(coin[i] > target){
                continue;
            }else{
                int tmp = target/coin[i];
                cnt+=tmp;
                target-=tmp*coin[i];
            }
        }

        System.out.println(cnt);

    }
}
