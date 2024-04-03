import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        Queue<Integer> queue;
        List<Integer> list;
        StringTokenizer st;
        int M; // 문서 개수
        int N; // 찾는 문서
        int priority = -1; // 찾는 문서의 중요도 (1이상, 9이하)
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < testCase; i++) { // 테스트 케이스 반복
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 문서 개수
            N = Integer.parseInt(st.nextToken()); // 찾는 문서의 인덱스 위치 M(0 ≤ M < N)

            st = new StringTokenizer(br.readLine());
            queue = new LinkedList<>();
            list = new ArrayList<>();

            // 문서를 큐, 리스트에 넣기
            for (int j = 0; j < M; j++) { // 문서 개수만큼 반복
                int num = Integer.parseInt(st.nextToken());
                queue.add(num);
                list.add(num);

                if(j == N) priority = num;
            }

            // 리스트 역순 정렬
//            Collections.reverse(list);
            list.sort(Comparator.reverseOrder());
//            System.out.println("list : " + list);
            // priority == num == queue.peek()
            // 리스트의 중요도 값과 큐에서 꺼낸수와 일치하는지 확인
            int cnt = 0;
            for (int j = 0; j < M; j++) { // 문서 개수만큼 반복
                int num = list.get(j); // 리스트 : 4,3,2,1, 큐 : 1,2,3,4

                while(num != queue.peek()){
                    queue.add(queue.poll());

                    if(N == 0) {
                        N = queue.size()-1;
                    }
                    else{
                        N--;
                    }
                }
                cnt++;

                if(num == priority && N == 0) {
                    sb.append(cnt + "\n");
                    break;
                }
                else{
                    queue.poll();
                    N--;
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}