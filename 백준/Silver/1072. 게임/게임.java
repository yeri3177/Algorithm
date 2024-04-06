import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [문제] 게임
 * 메모리    시간
 *
 * {(Y + a) / (X + a)} * 100 = Z + 1 -> a = ?
 * a = (ZX+X−100Y)/99−Z (Z<99)
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long X = Integer.parseInt(st.nextToken()); // 게임 횟수, 1이상 10억이하
        long Y = Integer.parseInt(st.nextToken()); // 이긴 게임, 0이상 X이하
        long Z = Y * 100 / X ; // 승률, 0이상 100이하

        if(Z >= 99) {
            System.out.println(-1);
            return;
        }
        double answer = (double)(Z*X + X - 100 * Y)/ (99-Z);

        // 소수점이 있으면 올림 해줘야함
        System.out.println((long)Math.ceil(answer));
        br.close();
    }
}