import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 로프의 개수
        int[] ropes = new int[N]; // 각 로프의 중량을 저장할 배열

        // 로프의 중량 입력
        for (int i = 0; i < N; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        // 로프의 중량을 내림차순으로 정렬
        Arrays.sort(ropes);
        reverseArray(ropes);

        // 최대 중량 계산
        int maxWeight = calculateMaxWeight(ropes);

        System.out.println(maxWeight);

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

    // 최대 중량을 계산하는 메서드
    private static int calculateMaxWeight(int[] ropes) {
        int maxWeight = 0;
        for (int i = 0; i < ropes.length; i++) {
            int weight = ropes[i] * (i + 1); // 현재 로프를 포함하여 들어올릴 수 있는 중량 계산
            maxWeight = Math.max(maxWeight, weight); // 최대 중량 업데이트
        }
        return maxWeight;
    }
}