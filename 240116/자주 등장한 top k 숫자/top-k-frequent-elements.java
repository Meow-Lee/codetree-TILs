import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());

        Map<Integer, Integer> map = new HashMap<>();
        stk = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(stk.nextToken());
            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            } else {
                map.put(val, 1);
            }
        }

        PriorityQueue<Info> pq = new PriorityQueue<>();
        for (int key : map.keySet()) {
            pq.offer(new Info(key, map.get(key)));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(pq.poll().key).append(' ');
        }
        System.out.println(sb.toString());
    }

    static class Info implements Comparable<Info>{
        int key, val;

        Info(int key, int val) {
            this.key = key;
            this.val = val;
        }

        @Override
        public int compareTo(Info info) {
            if (this.val == info.val) {
                return info.key - this.key;
            }
            return info.val - this.val;
        }
    }
}