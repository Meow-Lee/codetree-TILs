import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            pq.offer(Integer.parseInt(stk.nextToken()));
        }

        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();

            int tmp = Math.abs(a - b);
            if(tmp == 0){
                continue;
            }
            else{
                pq.offer(tmp);
            }
        }

        if(pq.isEmpty()){
            System.out.println(-1);
        }
        else{
            System.out.println(pq.poll());
        }
    }
}