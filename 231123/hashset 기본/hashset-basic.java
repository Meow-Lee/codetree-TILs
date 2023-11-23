import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
            String s = stk.nextToken();

            if (s.equals("add")) {
                int x = Integer.parseInt(stk.nextToken());
                set.add(x);
            } else if (s.equals("remove")) {
                int x = Integer.parseInt(stk.nextToken());
                set.remove(x);
            } else {
                int x = Integer.parseInt(stk.nextToken());
                if (set.contains(x)) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
        }
    }
}