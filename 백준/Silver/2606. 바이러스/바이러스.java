import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vertexSize = sc.nextInt(); // 정점 개수
        int edgeSize = sc.nextInt(); // 간선 개수

        // 정점과 간선으로 그래프 만들기
        int[][] graph = new int[vertexSize + 1][vertexSize + 1];
        // 방문한적 있는지 확인하는 배열
        boolean[] visited = new boolean[vertexSize + 1];

        // 정점, 간선 입력받아 그래프 그리기
        for (int i = 0; i < edgeSize; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        // dfs 실행
        dfs(graph, visited, 1);

        // 방문한적 있는지 카운트 해주기
        int answer = 0;

        // 방문하여 바이러스 감염된 개수 출력, 단 시작값은 제외
        for (int i = 0; i < visited.length; i++) {
            if (visited[i]) {
                if(i == 1) continue;
                answer++;
            }
        }

        // 정답 출력
        System.out.println(answer);
    }

    private static void dfs(int[][] graph, boolean[] visited, int start) {
        Stack<Integer> stack = new Stack<>();

        stack.push(start);
        visited[start] = true;

        while (!stack.isEmpty()) {
            int vertex = stack.pop();

            for (int i = 1; i < graph.length; i++) {
                // 인접 행렬을 봤을 때 연결된 정점인지
                // 방문 리스트를 봤을 때 방문한 적 없는 정점인지
                if (graph[vertex][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    stack.push(i);
                }
            }
        }
    }
}