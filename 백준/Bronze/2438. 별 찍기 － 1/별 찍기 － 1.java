import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();

        for(int row=1; row<=n; row++){
            for(int column=1; column<=row; column++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}