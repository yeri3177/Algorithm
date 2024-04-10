import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int count = 0;
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'O'){
                    count++;
                }else{
                    count = 0;
                }
                sum += count;

            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}