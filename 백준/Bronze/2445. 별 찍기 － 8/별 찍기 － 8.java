import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        int length;

        for (int row = 1, change = 1; row <= 2*N-1; row++) {
            length = (N-change)*2;

            for (int starLeft = 0; starLeft < change; starLeft++) {
                sb.append("*");
            }
            for (int blank = 0; blank < length; blank++) {
                sb.append(" ");
            }
            for (int starRight = 0; starRight < change; starRight++) {
                sb.append("*");
            }

            if(row < N) change++;
            else change--;
            sb.append("\n");
        }
        System.out.println(sb);
    }
}