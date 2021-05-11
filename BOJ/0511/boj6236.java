import java.io.*;

public class boj6236 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data = br.readLine().split(" ");
        int N = Integer.parseInt(data[0]);
        int M = Integer.parseInt(data[1]);
        int left = 1;
        int right = 10000*N;

        int[] money = new int[N];

        for(int i = 0; i < N; i++){
            money[i] = Integer.parseInt(br.readLine());
        }


        int now = 0;
        int cnt = 0;
        while(left <= right){
            int mid = (left+right)/2;
            cnt = howMany(money, mid);
            if(cnt == -1){
                left = mid + 1;
                continue;
            }

            if (cnt <= M) {
                right = mid - 1;
            }else{
                left = mid + 1;
            }

        }

        System.out.println(left);


    }

    public static int howMany(int[] data, int money){
        int cnt = 0;
        int now = 0; // 현재 내가 갖고 있는 돈

        for(int i = 0; i < data.length; i++){

            if(money < data[i]){
                return -1;
            }

            if(now < data[i]){
                now = money-data[i];
                cnt++;
            }else{
                now -= data[i];
            }
        }

        return cnt;
    }
}
