import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(arr[n-1]);
        int sumVal = 0;
        sumVal += arr[n-1];

        double maxAvg = 0;
        for (int i = n - 2; i >= 1; i--) {
            pq.add(arr[i]);
            sumVal += arr[i];

            double avg = (double) (sumVal - pq.peek()) / (n - i - 1);

            if (maxAvg < avg) {
                maxAvg = avg;
            }
        }

        System.out.printf("%.2f", maxAvg);
    }
}