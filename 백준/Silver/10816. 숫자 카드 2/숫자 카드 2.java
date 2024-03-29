import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 내가 가진 카드 개수 N과 카드 숫자들 myCard
        int N = Integer.parseInt(br.readLine());
        String myCard = br.readLine();

        // 내 카드와 비교할 카드 N개와 카드숫자들 isCard
        int M = Integer.parseInt(br.readLine());
        String isCard = br.readLine();

        // 문자열 myCard -> map
        StringTokenizer st = new StringTokenizer(myCard, " ");
        Map<String, Integer> map = new HashMap<>();

        while (st.hasMoreTokens()) {
            String card = st.nextToken();
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        // 정답 문자열
        StringBuilder sb = new StringBuilder();

        // 문자열 isCard -> 문자열 배열
        st = new StringTokenizer(isCard, " ");

        // isCard 하나씩 꺼내서 map과 일치하는지 비교
        for (int i = 0; i < M; i++) {
            String card = st.nextToken();
            sb.append(map.getOrDefault(card, 0)).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}