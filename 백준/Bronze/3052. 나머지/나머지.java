import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * 나머지
 * https://www.acmicpc.net/problem/3052
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> remainders = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            remainders.add(Integer.parseInt(br.readLine())%42);
        }

        System.out.println(remainders.size());
    }
}