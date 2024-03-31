import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String regExp = "(100+1+|01)+";
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < N; i++) {
            String spread = br.readLine();
            if(spread.matches(regExp)) {
                answer.append("YES");
            }
            else {
                answer.append("NO");
            }
            answer.append("\n");
        }
        System.out.println(answer);
        br.close();
    }
}