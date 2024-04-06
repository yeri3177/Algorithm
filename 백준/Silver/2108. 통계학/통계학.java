import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        int[] frequency = new int[8001]; // 최빈값용 배열
        int sum = 0; // 산술평균용 합계

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            nums[i] = num;

            sum += num; // 합계 구하기
            frequency[num+4000]++; // 빈도수 담기
        }

        // 최빈값 찾기
        // (1) 최대 빈도수 찾기
        int max = 0;
        for (int i = 0; i < 8001; i++) {
            if(max < frequency[i]) max = frequency[i];
        }
        // (2) 최대 빈도수를 갖는 수 찾기
        int mode = Integer.MIN_VALUE;
        int isMore = 0;

        for (int i = 0; i < 8001; i++) {
            if(frequency[i] == max){
                mode = i;
                isMore++;

                if(isMore >= 2) break;
            }
        }

        // 배열 오름차순 정렬
        Arrays.sort(nums);

        StringBuilder sb = new StringBuilder();

        // 1.산술평균 담기
        sb.append(Math.round((double) sum / N) + "\n");

        // 2.중앙값 담기
        sb.append(nums[N / 2] + "\n");

        // 3.최빈값 담기
        sb.append(mode-4000 + "\n");

        // 4.범위 담기
        sb.append(nums[N - 1] - nums[0]);

        System.out.println(sb);
        br.close();
    }
}