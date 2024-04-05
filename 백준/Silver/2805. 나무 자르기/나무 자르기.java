import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 나무의 수
        int M = Integer.parseInt(st.nextToken()); // 집으로 가져가려는 나무의 길이

        st = new StringTokenizer(br.readLine()); // 나무 높이들
        int max = Integer.MIN_VALUE; // 최대값
        int[] trees = new int[N];

        // 1.나무들 높이 중 최대값을 구하기
        for (int i = 0; i < N; i++) {
            int tree = Integer.parseInt(st.nextToken());
            max = Math.max(max, tree);
            trees[i] = tree;
        }

        // 2.
        int min = 0; // 최소값

        while (min < max) {
            int mid = (min + max) / 2; // 중간값
            long sum = 0;

            // mid 길이로 잘랐을때 나무길이들 더하기
            for(int tree : trees) {
                if(tree-mid > 0) {
                    sum += tree-mid;
                }
            }

            // sum보다 M이 크면 max를 mid길이로 해서 sum 크게 하기
            if(sum < M) {
                max = mid;
            }
            else {
                min = mid + 1;
            }
        }

        System.out.println(min-1);
        br.close();
    }
}