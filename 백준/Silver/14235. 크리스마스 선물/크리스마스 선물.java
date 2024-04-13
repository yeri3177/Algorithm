import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int N = Integer.parseInt(br.readLine()); // 방문한 횟수

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if ("0".equals(str)) { // 아이들 만남
                if (pq.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            } else { // 거점에서 선물 충전
                st = new StringTokenizer(str);

                st.nextToken();
                while (st.hasMoreTokens()) {
                    pq.offer(Integer.parseInt(st.nextToken()));
                }

            }
        }
        System.out.println(sb);
        br.close();
    }
}