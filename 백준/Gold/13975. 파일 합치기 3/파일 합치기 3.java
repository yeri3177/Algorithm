import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // T개의 테스트 데이터
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int tc = 0; tc < T; tc++) {
            // 소설을 구성하는 장의 수, 양의 정수 K (3 ≤ K ≤ 1,000,000)
            int K = Integer.parseInt(br.readLine());

            // 1장부터 K장까지 수록한 파일의 크기
            st = new StringTokenizer(br.readLine());

            // PriorityQueue 생성
            PriorityQueue<Long> pq = new PriorityQueue<>();

            // pq에 파일 넣기
            for (int i = 0; i < K; i++) {
                pq.offer(Long.parseLong(st.nextToken()));
            }

            long sum = 0;

            while (pq.size() > 1) {
                long file1 = pq.poll();
                long file2 = pq.poll();

                sum += file1 + file2;
                pq.offer(file1 + file2);
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}