import java.util.*;
import java.io.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
            String str = stk.nextToken();

            if(str.equals("add")){
                int k = Integer.parseInt(stk.nextToken());
                int v = Integer.parseInt(stk.nextToken());

                map.put(k, v);
            }
            else if(str.equals("remove")){
                int k = Integer.parseInt(stk.nextToken());

                map.remove(k);
            }
            else if(str.equals("find")){
                int k = Integer.parseInt(stk.nextToken());

                if(map.containsKey(k)){
                    System.out.println(map.get(k));
                }
                else{
                    System.out.println("None");
                }
            }
            else{
                Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();

                if(map.isEmpty()){
                    System.out.println("None");
                }
                else{
                    while(it.hasNext()){
                        Entry<Integer,Integer> entry = it.next();

                        System.out.print(entry.getValue()+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}