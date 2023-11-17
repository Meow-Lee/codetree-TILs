import java.util.*;
import java.io.*;

public class Main {
    static class Pair implements Comparable<Pair> {
        int x, y;

        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair p){
            if((this.x + this.y) == (p.x + p.y)){
                if(this.x == p.x){
                    return this.y - p.y;
                }
                return this.x - p.x;
            }

            return (this.x + this.y) - (p.x + p.y);
        }
    }
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            stk = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(stk.nextToken());
            int y = Integer.parseInt(stk.nextToken());

            pq.offer(new Pair(x,y));
        }

        for(int i=0; i<m; i++){
            Pair tmp = pq.poll();
            tmp.x += 2;
            tmp.y += 2;

            pq.offer(tmp);
        }

        Pair ans = pq.poll();
        
        System.out.println(ans.x + " " + ans.y);
    }
}