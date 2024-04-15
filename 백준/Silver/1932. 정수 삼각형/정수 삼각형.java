import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] triangle = new int[N][N]; // 정수 삼각형 배열 생성

        // 정수 삼각형 입력 받기
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 각 층의 숫자를 이용하여 최대 합 계산
        for (int i = 1; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                // 맨 왼쪽 숫자는 오른쪽 위에서만 올 수 있음
                if (j == 0) {
                    triangle[i][j] += triangle[i - 1][j];
                }
                // 맨 오른쪽 숫자는 왼쪽 위에서만 올 수 있음
                else if (j == i) {
                    triangle[i][j] += triangle[i - 1][j - 1];
                }
                // 중간 숫자들은 두 방향에서 올 수 있음
                else {
                    triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
                }
            }
        }

        // 가장 아래층에 있는 숫자들 중 최대값 찾기
        int maxSum = 0;
        for (int num : triangle[N - 1]) {
            maxSum = Math.max(maxSum, num);
        }

        System.out.println(maxSum); // 최대값 출력
    }
}