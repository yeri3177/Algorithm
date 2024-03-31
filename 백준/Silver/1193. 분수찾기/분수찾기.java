import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        int line = 1;
        while (N > line) {
            N -= line;
            line += 1;
        }
        StringBuilder sb = new StringBuilder();

        if(line%2 == 0){
            sb.append(N + "/" + (line-N+1));
        }else{
            sb.append((line-N+1) + "/" + N);
        }
        System.out.println(sb);
    }
}