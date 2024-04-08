import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 정점의 수 N (5 ≤ N ≤ 100,000)
        int N = Integer.parseInt(st.nextToken());
        // 간선의 수 M (1 ≤ M ≤ 200,000)
        int M = Integer.parseInt(st.nextToken());
        // 시작 정점 R (1 ≤ R ≤ N)
        int R = Integer.parseInt(st.nextToken());

        // 정점 방문한적 있는지 확인하는 배열
        // 1번부터 N번까지 사용
        int[] visitOrder = new int[N + 1];

        // 그래프 만들기
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

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
        dfs(graph, visitOrder, R);

        StringBuilder sb = new StringBuilder();

        // visitOrder의 내용을 sb에 담기
        for (int i = 1; i <= N; i++) {
            sb.append(visitOrder[i]).append("\n");
        }

        // 정답 문자열 출력
        System.out.println(sb);
        br.close();
    }

    private static void dfs(ArrayList<ArrayList<Integer>> graph, int[] visitOrder, int R) {
//        Stack<Integer> stack = new Stack<>();
        LinkedList<Integer> q = new LinkedList<>();
        int count = 1;

        // 시작값 visitOrder에 값 넣어주기
        visitOrder[R] = count++;

        // 시작값 스택에 넣어주기
//        stack.push(R);
        q.offer(R);

        // 스택 비어있지않으면 반복
        while (!q.isEmpty()) {
//            Integer vertex = stack.pop();
            Integer vertex = q.poll();

            // 해당 정점이 연결된 정점수만큼 반복
            for (int i = 0; i < graph.get(vertex).size(); i++) {
                int num = graph.get(vertex).get(i);

                // 해당 정점의 방문순서가 0이면
                if (visitOrder[num] == 0) {
//                    stack.push(num); // 스택 넣기
                    q.offer(num); // 스택 넣기
                    visitOrder[num] = count++; // 방문순서 넣기
                }
            }
        }
    }
}