import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 오영식이 이미 가지고 있는 랜선의 개수 K
        // K는 1이상 10,000이하의 정수
        int K = Integer.parseInt(st.nextToken());

        // 필요한 랜선의 개수 N
        // N은 1이상 1,000,000이하의 정수, 항상 K ≦ N
        int N = Integer.parseInt(st.nextToken());

        // 랜선 길이를 담을 배열 선언
        long[] arr = new long[K];

        // 최대 랜선 길이 수
        int max = 0;

        // 배열에 랜선 담기 & 랜선길이 최대값 구하기
        for (int i = 0; i < K; i++) {
            int length = Integer.parseInt(br.readLine());
            arr[i] = length;
            max = Math.max(max, length);
        }

        long start = 1;
        long end = max;

        while (start <= end) {
            long mid = (start + end) / 2;
            long sum = 0;

            for (int i = 0; i < K; i++) {
                sum += (arr[i] / mid);
            }

            if (sum >= N) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        System.out.println(end);
        br.close();
    }
}