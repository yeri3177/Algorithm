import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;


        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int H = Integer.parseInt(st.nextToken()); // 호텔의 층 수
            int W = Integer.parseInt(st.nextToken()); // 각 층의 방 수
            int N = Integer.parseInt(st.nextToken()); // 몇 번째 손님

            int floor;
            int cnt;

            if(N % H == 0){
                floor = H;
                cnt = N / H;
            }
            else{
                floor = N % H;
                cnt = (N / H) + 1;
            }
            sb.append(floor * 100 + cnt).append("\n");
        }
        System.out.println(sb);

        br.close();
    }
}