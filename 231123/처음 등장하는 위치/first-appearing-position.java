import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new TreeMap<>();
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(stk.nextToken());

            if (!map.containsKey(tmp)) {
                map.put(tmp, i + 1);
            }
        }

        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}