import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        int[] num = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            num[i] = Integer.parseInt(stk.nextToken());
        }

        double ans = 0;
        int idx = 2;
        while (idx <= n) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = idx; i <= n; i++) {
                pq.offer(num[i]);
            }
            pq.poll();

            int sum = 0;
            int size = pq.size();
            while (!pq.isEmpty()) {
                sum += pq.poll();
            }

            if (size == 0) {
                idx++;
                continue;
            }
            ans = Math.max(ans, sum / (double) size);
            idx++;
        }
        System.out.printf("%.2f", ans);
    }
}