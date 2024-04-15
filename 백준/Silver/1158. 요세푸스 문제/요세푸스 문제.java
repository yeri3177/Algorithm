import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); // N명의 사람
        int K = Integer.parseInt(input[1]); // K번째 사람 제거

        Queue<Integer> queue = new LinkedList<>(); // 요세푸스 순열을 저장할 큐
        for (int i = 1; i <= N; i++) {
            queue.offer(i); // 1부터 N까지의 숫자를 큐에 저장
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll()); // K-1번째 사람까지 숫자를 제거하면서 순열을 회전시킴
            }
            sb.append(queue.poll()); // K번째 사람을 제거하여 결과에 추가
            if (!queue.isEmpty()) {
                sb.append(", "); // 만약 큐가 비어있지 않다면 쉼표를 추가하여 구분
            }
        }

        sb.append(">");
        System.out.println(sb.toString()); // 요세푸스 순열 출력
        br.close();
    }
}