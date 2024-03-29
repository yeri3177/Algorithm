import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[] nums;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sb = new StringBuilder();
        nums = new int[M];
        dfs(1, 0);
        System.out.println(sb);
    }

    public static void dfs(int idx, int depth){
        if (depth == M) {
            for (int val : nums) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = idx; i <= N; i++) {
            nums[depth] = i;
            dfs(i+1, depth+1);
        }
    }
}