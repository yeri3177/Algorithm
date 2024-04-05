import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. N, int[] 선언 및 초기화
        int N = Integer.parseInt(br.readLine()); // 사람 수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 배열 오름차순 정렬
        Arrays.sort(arr);

        // 3. 합계 구하기
        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer += arr[i] * (N-i);
        }

        System.out.println(answer);
        br.close();
    }
}