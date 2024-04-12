import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();	// 주어진 수는 사용하지 않는다.

        // 입력값 범위는 1000이하의 자연수
        boolean[] primeArray = getPrimeArray(1000);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        while( st.hasMoreTokens() ) {
            int num = Integer.parseInt(st.nextToken());
            if( !primeArray[num] ) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    // 소수이면 false, 아니면 true
    public static boolean[] getPrimeArray(int max) {
        boolean[] primeArray = new boolean[max + 1];
        primeArray[0] = true;
        primeArray[1] = true;

        for (int i = 2; i <= Math.sqrt(max); i++) {
            if (primeArray[i]) continue;

            for (int j = i * i; j < primeArray.length; j += i) {
                primeArray[j] = true;
            }
        }

        return primeArray;
    }
}