import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = 1;

        for (int i = 0; i < 3; i++) {
            num *= Integer.parseInt(br.readLine());
        }

        int[] arr = new int[10];

        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            arr[digit]++;
        }

        for (int idx : arr) {
            sb.append(idx).append("\n");
        }
        System.out.println(sb);
    }
}