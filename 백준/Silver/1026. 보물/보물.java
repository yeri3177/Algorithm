import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];

        // 배열 A 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 B 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 A는 오름차순 정렬
        Arrays.sort(A);

        // 배열 B는 내림차순 정렬
        Arrays.sort(B);
        reverseArray(B);

        // 최소 내적 계산
        int minDotProduct = calculateMinDotProduct(A, B);

        System.out.println(minDotProduct);

        br.close();
    }

    // 배열을 역순으로 뒤집는 메서드
    private static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // 최소 내적을 계산하는 메서드
    private static int calculateMinDotProduct(int[] A, int[] B) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result += A[i] * B[i];
        }
        return result;
    }
}