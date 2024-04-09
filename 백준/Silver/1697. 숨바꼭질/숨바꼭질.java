import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        // 수빈이가 있는 위치, N(0 ≤ N ≤ 100,000)
        int N = Integer.parseInt(st.nextToken());
        // 동생이 있는 위치, K(0 ≤ K ≤ 100,000)
        int K = Integer.parseInt(st.nextToken());

        // bfs 실행
        System.out.println(bfs(N, K));
        br.close();
    }
    static int bfs(int N, int K) {
        int time = 0;

        // 처음부터 위치 같으면 0 리턴
        if(N == K) return time;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);

        // 인덱스 : 위치, 0~10만
        // 값 : 찾는 시간
        int[] visited = new int[100001];
        visited[N] = 1;

        loop:
        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = now + 1;
                } else if (i == 1) {
                    next = now - 1;
                } else {
                    next = now * 2;
                }

                if (next == K) {
                    time = visited[now];
                    break loop;
                }
                if (next >= 0 && next <= 100000 && visited[next] == 0) {
                    queue.offer(next);
                    visited[next] = visited[now] + 1;
                }
            }
        }
        return time;
    }
}