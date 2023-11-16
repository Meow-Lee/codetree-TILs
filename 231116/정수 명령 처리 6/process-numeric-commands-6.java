import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
            
            String s = stk.nextToken();

            if(s.equals("push")){
                int tmp = Integer.parseInt(stk.nextToken());
                pq.offer(tmp);
            }
            else if(s.equals("pop")){
                System.out.println(pq.poll());
            }
            else if(s.equals("size")){
                System.out.println(pq.size());
            }
            else if(s.equals("empty")){
                if(pq.isEmpty()){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else{
                System.out.println(pq.peek());
            }
        }
    }
}