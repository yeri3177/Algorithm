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
        System.out.println(bfs(1, 1));
        br.close();
    }

    private static int bfs(int x, int y) {
        visited[x][y] = true;
        Queue<Coordinate> q = new LinkedList<>();
        q.add(new Coordinate(x, y, 1));

        while (!q.isEmpty()) {
            Coordinate c = q.poll();

            if (c.x == N && c.y == M) return c.c;

            for (int i = 0; i < 4; i++) {
                int nowX = c.x + dx[i];
                int nowY = c.y + dy[i];

                if (nowX >= 1 && nowY >= 1 && nowX <= N && nowY <= M) {
                    if (!visited[nowX][nowY] && maze[nowX][nowY] == 1) {
                        visited[nowX][nowY] = true;
                        q.add(new Coordinate(nowX, nowY, c.c + 1));
                    }
                }
            }
        }
        return 0;
    }

    // 좌표를 나타내는 클래스
    static class Coordinate {
        int x;
        int y;
        int c;

        public Coordinate(int x, int y, int c) {
            this.x = x;
            this.y = y;
            this.c = c;
        }
    }
}