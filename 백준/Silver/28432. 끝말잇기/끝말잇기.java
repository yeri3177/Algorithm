import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        int indexSum = -1;
        int index = -1;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            sb.append(word);
            indexSum += word.length();
            set.add(word);
            if("?".equals(word)) index = indexSum;
        }

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String word = br.readLine();
            char wordStart = word.charAt(0);
            char wordEnd = word.charAt(word.length() - 1);

            if(N == 1 || M == 1) {
                System.out.println(word);
                break;
            };
            if(set.contains(word)){
                continue;
            }

            if(index == 0){ // ?가 맨앞글자
                if(sb.charAt(index + 1) == wordEnd) {
                    System.out.println(word);
                    break;
                }
            }else if (index == indexSum){ // ?가 맨뒤글자
                if(sb.charAt(index - 1) == wordStart) {
                    System.out.println(word);
                    break;
                }
            }else{ // ?가 중간글자
                if(sb.charAt(index - 1) == wordStart && sb.charAt(index + 1) == wordEnd) {
                    System.out.println(word);
                    break;
                }
            }
        }
        br.close();
    }
}