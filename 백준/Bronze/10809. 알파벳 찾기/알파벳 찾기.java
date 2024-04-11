import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] alphabet = new int[26];

        for (int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }

        String word = br.readLine();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(alphabet[ch - 'a'] == -1) {
                alphabet[ch - 'a'] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            sb.append(alphabet[i] + " ");
        }
        System.out.println(sb);
        br.close();
    }
}