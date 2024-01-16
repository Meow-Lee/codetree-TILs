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

        int[] prefixSum = new int[n + 1];
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += num[i];
            prefixSum[i] = sum;
        }

        double ans = 0;
        int idx = 1;
        while (idx < n) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = idx+1; i <= n; i++) {
                pq.offer(num[i]);
            }

            int val = prefixSum[n] - prefixSum[idx] - pq.poll();
            int size = pq.size();

            if (size == 0) {
                idx++;
                continue;
            }
            ans = Math.max(ans, val / (double) size);
            idx++;
        }
        System.out.printf("%.2f", ans);
    }
}