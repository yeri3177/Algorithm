import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Main {
    static int N;
    static int M;
    static int[][] maze;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];

        for (int row = 1; row <= N; row++) {
            String line = br.readLine();
            for (int col = 1; col <= M; col++) {
                maze[row][col] = line.charAt(col-1) - '0';
            }
        }
        bfs(1, 1);
        System.out.println(maze[N][M]);
        br.close();
    }

    private static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x,y});
        visited[x][y] = true;
        
        while (!q.isEmpty()) {
            int now[] = q.poll();
            int nowX = now[0];
            int nowY = now[1];

            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if (nextX >= 1 && nextY >= 1 && nextX <= N && nextY <= M) {
                    if (!visited[nextX][nextY] && maze[nextX][nextY] == 1) {

                        q.add(new int[]{nextX, nextY});
                        visited[nextX][nextY] = true;
                        maze[nextX][nextY] = maze[nowX][nowY] + 1;
                    }
                }
            }
        }
    }
}