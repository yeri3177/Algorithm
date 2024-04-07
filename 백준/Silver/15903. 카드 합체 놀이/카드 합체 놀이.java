import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 카드의 개수를 나타내는 수 n(2 ≤ n ≤ 1,000)
        int n = Integer.parseInt(st.nextToken());

        // 카드 합체를 몇 번 하는지를 나타내는 수 m(0 ≤ m ≤ 15×n)
        int m = Integer.parseInt(st.nextToken());

        // 카드를 담을 우선순위 큐 선언
        PriorityQueue<Long> pq = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());

        // 큐에 카드 담기
        for (int i = 0; i < n; i++) {
            pq.add(Long.parseLong(st.nextToken()));
        }

        // 카드합체할 m번만큼 반복
        for (int i = 0; i < m; i++) {
            // 카드 두개 꺼내기 (최소값순으로)
            Long card1 = pq.poll();
            Long card2 = pq.poll();

            // 카드 두개 합친 값을 큐에 넣기 (덮어쓰기)
            Long sum = card1 + card2;
            pq.add(sum);
            pq.add(sum);
        }

        long point = 0;

        // 큐에 있는 카드들 더하기 
        while(!pq.isEmpty()) {
            point += pq.poll();
        }

        // 점수 출력
        System.out.println(point);
        br.close();
    }
}