import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<String> notHear = new HashSet<>(); // 듣도 못한
        List<String> answer = new ArrayList<>(); // 듣도 보도 못한

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            notHear.add(br.readLine());
        }

        for (int i = 0; i < N; i++) {
            String name = br.readLine(); // 보도 못한

            if(notHear.contains(name)) answer.add(name);
        }

        Collections.sort(answer);
        int size = answer.size();

        StringBuilder sb = new StringBuilder();

        sb.append(size+"\n");
        for (int i = 0; i < size; i++) {
            sb.append(answer.get(i)+"\n");
        }

        System.out.println(sb);
        br.close();
    }
}