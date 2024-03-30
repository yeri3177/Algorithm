import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int[] alphabet = new int[26];
        for (char ch : word.toCharArray()) {
            int idx = ch-'A';
            alphabet[idx]++;
        }

        StringBuilder sb = new StringBuilder();
        int odd = 0;
        char temp = ' ';

        for (int i = 0; i < 26; i++) {
            int cnt = alphabet[i];
            if(cnt == 0) continue;
            if(cnt%2 != 0) { // 홀수이면
                temp = (char)(i+'A');
                odd++;

            }
            for (int j = 0; j < cnt/2; j++) {
                sb.append((char)(i+'A'));
            }
        }

        if(odd>1 || (odd==1 && word.length()%2==0)){
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder tempSb = new StringBuilder(sb).reverse();
        if(temp != ' ') sb.append(temp);
        sb.append(tempSb);
        System.out.println(sb);
        br.close();
    }
}