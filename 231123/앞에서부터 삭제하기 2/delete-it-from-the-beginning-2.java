import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = Integer.parseInt(stk.nextToken());
        }

        float ans = 0;
        for(int i=0; i<n-2; i++){
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int k=i+1; k<n; k++){
                pq.offer(num[k]);
            }

            int sum = 0;
            int count = 0;
            while(pq.size()!=1){
                sum += pq.poll();
                count++;
            }
            ans = Math.max(ans, sum/(float)count);
        }
        System.out.printf("%.2f", ans);
    }
}