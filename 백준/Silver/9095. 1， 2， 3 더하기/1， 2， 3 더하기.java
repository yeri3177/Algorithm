import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트케이스

        int[] array = new int[11];

        array[1] = 1;
        array[2] = 2;
        array[3] = 4;

        for(int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());

            for(int j = 4; j <= num; j++) {
                array[j] = array[j - 1] + array[j - 2] + array[j - 3];
            }
            sb.append(array[num]).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}