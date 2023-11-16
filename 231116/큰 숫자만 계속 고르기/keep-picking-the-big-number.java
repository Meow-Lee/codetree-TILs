import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        stk = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++){
            pq.offer(Integer.parseInt(stk.nextToken()));
        }

        for(int i=0; i<m; i++){
            int tmp = pq.poll();
            tmp -= 1;
            pq.offer(tmp);
        }

        System.out.println(pq.peek());
    }
}