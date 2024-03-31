import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] numArr;
    static int[] out;
    static boolean[] visited;
    static int N;
    static int M;
    static StringBuilder answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numArr = new int[N];
        visited = new boolean[N];
        out = new int[M];
        answer = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numArr);

        dfs(0);
        System.out.println(answer);
        br.close();
    }

    static void dfs(int cnt){
        if(cnt == M){
            for(int i = 0; i<M; i++)
                answer.append(out[i]+" ");
            answer.append("\n");
        }

        else{
            int before = 0;
            for(int i = 0; i<N; i++){
                if(visited[i]) continue;

                if(before != numArr[i]){
                    visited[i] = true;
                    out[cnt] = numArr[i];
                    before = numArr[i];
                    dfs(cnt+1);
                    visited[i] = false;
                }
            }
        }
    }
}