import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(stk.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        stk = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            if (set.contains(Integer.parseInt(stk.nextToken()))) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}