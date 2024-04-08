import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int count = 1;
    static int[] visitOrder;
    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 정점의 수 N (5 ≤ N ≤ 100,000)
        int N = Integer.parseInt(st.nextToken());
        // 간선의 수 M (1 ≤ M ≤ 200,000)
        int M = Integer.parseInt(st.nextToken());
        // 시작 정점 R (1 ≤ R ≤ N)
        int R = Integer.parseInt(st.nextToken());

        // 정점순으로 방문순서 담는 배열
        // 1번부터 N번까지 사용
        visitOrder = new int[N + 1];

        // 그래프 생성
        graph = new ArrayList<>();

        // 그래프 초기화
        // 1번부터 N번까지 사용
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // 간선정보 입력받아 그래프 그리기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // 그래프 정점순으로 정렬
        for (int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

        // dfs 실행
        dfs(R);

        StringBuilder sb = new StringBuilder();

        // visitOrder의 내용을 sb에 담기
        for (int i = 1; i <= N; i++) {
            sb.append(visitOrder[i]).append("\n");
        }

        // 정답 문자열 출력
        System.out.println(sb);
        br.close();
    }

    private static void dfs(int vertex) {
        visitOrder[vertex] = count++;

        // 해당 정점이 연결된 정점수만큼 반복
        for (int i = 0; i < graph.get(vertex).size(); i++) {
            int num = graph.get(vertex).get(i);

            if (visitOrder[num] == 0) {
                dfs(num);
            }
        }
    }
}