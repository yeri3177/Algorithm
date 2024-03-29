import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 5.알고리즘 수업 - 점근적 표기 1
 * https://www.acmicpc.net/problem/24313
 * 
 * 메모리    시간
 * 14224	136
 *
 * n ≥ n0, f(n) ≤ c × g(n)
 * f(n) = a1*n + a0
 *
 * a1*n + a0 <= c*n
 * a0 <= c*n - a1*n
 * a0 <= (c-a1)n
 * c-a1 >= 0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        br.close();
        System.out.println((a1 * n0 + a0 <= c * n0) && (c >= a1)? 1 : 0);
    }
}