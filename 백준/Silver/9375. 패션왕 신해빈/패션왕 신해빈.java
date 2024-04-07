import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine()); // 테스트케이스 수
        StringBuilder sb = new StringBuilder();

        Map<String, Integer> map;
        StringTokenizer st;

        for (int tc = 0; tc < testCase; tc++) {
            // 해빈이가 가진 의상의 수 n(0 ≤ n ≤ 30)
            int n = Integer.parseInt(br.readLine());

            // 테스트케이스마다 map 생성
            map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                String cloth = st.nextToken();
                String type = st.nextToken();

                // map에 타입별로 옷의 가지수 넣기
                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int ans = 1;

            // 옷의 가지수 + 1을 해줘서 곱해줘야 한다.
            // 어떤 타입이 2개라면 없는 경우도 세줘서 3가지 경우가 된다.
            for (int val : map.values()){
                ans *= val + 1;
            }

            // ans에서 전부 없는 경우의 수인 1개를 빼서 sb에 넣는다.
            sb.append(ans - 1).append("\n");
        }

        // 정답 문자열 출력
        System.out.println(sb);
        br.close();
    }
}