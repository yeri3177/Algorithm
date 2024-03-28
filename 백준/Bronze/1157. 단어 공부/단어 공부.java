import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int[] alphabet = new int[26];
        int strLength = str.length();

        for (int i = 0; i < strLength; i++) {
            alphabet[str.charAt(i)-'A']++;
        }

        int max = Integer.MIN_VALUE;
        int count = 0;
        int index = -1;

        for (int i = 0; i < 26; i++) {
            if(alphabet[i] == 0) continue;

            if (max < alphabet[i]) {
                max = alphabet[i];
                index = i;
                count = 1;
            } else if (max == alphabet[i]) {
                count++;
            }
        }

        if(count > 1){
            System.out.println("?");
        }else{
            System.out.println((char)(index+'A'));
        }
    }
}