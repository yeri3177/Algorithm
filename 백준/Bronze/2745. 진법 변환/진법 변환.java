import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int answer = 0;
        int pow = 1;

        for(int i = N.length()-1 ; i >= 0; i--){
            char C = N.charAt(i);

            if (C >= 'A' && C <= 'Z') {
                answer += (C - 'A' + 10) * pow;
            } else {
                answer += (C - '0') * pow;
            }
            pow *= B;
        }
        System.out.println(answer);
        br.close();
    }
}