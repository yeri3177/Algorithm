import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long X = Integer.parseInt(st.nextToken());
        long Y = Integer.parseInt(st.nextToken());
        long Z = Y * 100 / X ;

        if(Z >= 99) {
            System.out.println(-1);
            return;
        }

        long start = 0;
        long end = 1000000000;

        while (start < end) {
            long mid = (start + end) / 2;
            long ret = (Y + mid) * 100 / (X + mid);

            if (ret > Z) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(end);
        br.close();
    }
}