import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int[] alphabet = new int[26];

        for (int i = 0; i < str.length(); i++) {
            alphabet[str.charAt(i)-'A'] += 1;
        }

        int max = Arrays.stream(alphabet).max().getAsInt();
        int count = 0;
        int index = -1;

        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == max) {
                count++;
                index = i;
            }
        }

        if(count > 1){
            System.out.println("?");
        }else{
            System.out.println((char)(index+'A'));
        }
    }
}