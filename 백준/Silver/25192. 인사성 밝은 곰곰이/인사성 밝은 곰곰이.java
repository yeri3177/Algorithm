import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            if ("ENTER".equals(name)) {
                set.clear();
            } else {
                if (set.contains(name)) continue;
                set.add(name);
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
