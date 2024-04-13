import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;
    static int V;
    static int[][] graph;
    static boolean[] dfs_visit;
    static boolean[] bfs_visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 정점의 개수
        M = Integer.parseInt(st.nextToken()); // 간선의 개수
        V = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점의 번호

        graph = new int[N + 1][N + 1];
        dfs_visit = new boolean[N + 1];
        bfs_visit = new boolean[N + 1];

        // 그래프 그리기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            graph[n][m] = 1;
            graph[m][n] = 1;
        }

        // dfs 실행
        dfs(V);
        sb.append("\n");

        // bfs 실행
        bfs(V);

        System.out.println(sb);
        br.close();
    }

    static void dfs(int n) {
        dfs_visit[n] = true;
        sb.append(n + " ");

        for (int i = 1; i <= N; i++) {
            if (graph[n][i] == 1 && dfs_visit[i] == false) {
                dfs(i);
            }
        }
    }

    static void bfs(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        bfs_visit[n] = true;
        sb.append(n + " ");

        while (!queue.isEmpty()) {
            int num = queue.poll();

            for (int i = 1; i <= N; i++) {
                if (graph[num][i] == 1 && bfs_visit[i] == false) {
                    queue.offer(i);
                    bfs_visit[i] = true;
                    sb.append(i + " ");
                }
            }
        }
    }
}