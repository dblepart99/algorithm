import java.io.*;
import java.util.*;

public class boj13904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<hw> hList = new ArrayList<>();
        String[] data = null;
        int max = 0;
        for (int i = 0; i < N; i++) {
            data = br.readLine().split(" ");
            hList.add(new hw(Integer.parseInt(data[0]), Integer.parseInt(data[1])));
            if (max < Integer.parseInt(data[0])) {
                max = Integer.parseInt(data[0]);
            }
        }
        Collections.sort(hList);


        int[] score = new int[max + 1];



        for(hw h: hList){
            int k = h.d;
            while (true) {
                if (score[k] == 0) {
                    score[k] = h.w;
                    break;
                }
                k--;
                if (k < 1) {
                    break;
                }
            }
        }

        int ans = 0;

        for (int i = 0; i < score.length; i++) {
            ans += score[i];
        }

        System.out.println(ans);


    }
}

class hw implements Comparable<hw> {
    int d;
    int w;

    public hw(int d, int w) {
        this.d = d;
        this.w = w;
    }

    @Override
    public int compareTo(hw o) {
        if (o.w == this.w) {
            return this.d - o.d;
        }
        return o.w - this.w;
    }

    public String toString() {
        return this.d + " " + this.w;
    }
}
