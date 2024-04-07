import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 처음에 주어진 숫자들을 배열에 넣기
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 이분 탐색을 위해 정렬
        Arrays.sort(arr);

        // 찾을 숫자들의 개수 
        int M = Integer.parseInt(br.readLine());

        // 출력용 문자열
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M ; i++) {
            int target = Integer.parseInt(st.nextToken());

            sb.append(binarySearch(arr, target)).append("\n");
        }

        // 정답 출력
        System.out.println(sb);
        br.close();
    }

    // 정수배열 arr에서 해당 정수 target 찾기 
    // 있으면 1 리턴, 없으면 0 리턴 
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (arr[mid] == target) {
                return 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }
}