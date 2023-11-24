import java.util.*;
import java.io.*;

public class Main {
    static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
    static int[] dy = {1, -1, 2, -2, 2, -2, 1, -1};
    static int[][] grid;
    static boolean[][] visited;
    static int n;
    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        grid = new int[n][n];
        visited = new boolean[n][n];

        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        int x1 = Integer.parseInt(stk.nextToken()) - 1;
        int y1 = Integer.parseInt(stk.nextToken()) - 1;
        int x2 = Integer.parseInt(stk.nextToken()) - 1;
        int y2 = Integer.parseInt(stk.nextToken()) - 1;

        for (int i = 0; i < n; i++) {
            Arrays.fill(grid[i], -1);
        }

        bfs(x1, y1, x2, y2);
        if (grid[x2][y2] == -1) {
            System.out.println(-1);
        } else {
            System.out.println(grid[x2][y2]);
        }
    }

    static void bfs(int x1, int y1, int x2, int y2) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(x1, y1));
        grid[x1][y1] = 0;
        visited[x1][y1] = true;

        while (!q.isEmpty()) {
            Pair cur = q.poll();
            for (int dir = 0; dir < 8; dir++) {
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];
                if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                q.offer(new Pair(nx, ny));
                visited[nx][ny] = true;
                grid[nx][ny] = grid[cur.x][cur.y] + 1;
            }
        }
    }
}