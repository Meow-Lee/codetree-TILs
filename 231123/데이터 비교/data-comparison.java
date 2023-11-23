import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(stk.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        stk = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            int tmp = Integer.parseInt(stk.nextToken());
            if (set.contains(tmp)) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }
}