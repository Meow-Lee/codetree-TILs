import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());
        int[] arr = new int[1001];

        Map<Integer, Integer> map = new HashMap<>();
        stk = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(stk.nextToken());
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        int ans = 0;
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])-1);
            }
            else{
                map.put(arr[i], -1);
            }

            for(int j=0; j<i; j++){
                if(map.containsKey(k-arr[i]-arr[j])){
                    ans += map.get(k-arr[i]-arr[j]);
                }
            }
        }
        System.out.println(ans);
    }
}