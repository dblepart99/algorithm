import java.io.*;
import java.util.*;

public class boj15903 {

}
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] data = input.split(" ");
        int n = Integer.parseInt(data[0]);
        int m = Integer.parseInt(data[1]);

        long[] arr = new long[n];
        data = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(data[i]);
        }

        for(int i = 0; i < m; i++){
            Arrays.sort(arr);
            long tmp = arr[0];
            arr[0]+=arr[1];
            arr[1]+=tmp;
        }
        long sum = 0;

        for(int i = 0; i < n; i++){
            sum+= arr[i];
        }

        System.out.println(sum);


    }
}
