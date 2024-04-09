import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        int location = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            count++;

            if (max < num) {
                max = num;
                location = count;
            }
        }

        System.out.println(max + "\n" + location);
    }
}
