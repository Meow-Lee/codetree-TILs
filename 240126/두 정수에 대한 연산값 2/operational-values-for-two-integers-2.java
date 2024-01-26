import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());

        if (isBigger(a, b)) {
            a = a * 2;
            b += 10;
        } else {
            b = b * 2;
            a += 10;
        }

        System.out.println(a + " " + b);
    }

    private static boolean isBigger(int a, int b) {
        if (a < b) {
            return false;
        }
        return true;
    }
}