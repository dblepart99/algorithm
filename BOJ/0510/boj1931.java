import java.io.*;
import java.util.*;

public class boj1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<time> tList = new ArrayList<>();
        String[] data = new String[2];
        for (int i = 0; i < N; i++) {
            data = br.readLine().split(" ");
            tList.add(new time(Integer.parseInt(data[0]), Integer.parseInt(data[1])));
        }

        Collections.sort(tList);

        int cnt = 1;
        time tmp = tList.get(0);
        for(int i = 1; i < N; i++){

            if(tList.get(i).start < tmp.end){
                continue;
            }else{
                tmp = tList.get(i);
                cnt++;
            }

        }


        System.out.println(cnt);

    }
}

class time implements Comparable<time>{
    int start;
    int end;
    public time(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(time o){
        if(this.end == o.end){
            return this.start - o.start;
        }
        return this.end - o.end;
    }

    public String toString(){
        return this.start+" "+this.end;
    }
}
