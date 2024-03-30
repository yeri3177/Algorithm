import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), i);
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            String car = br.readLine();

            Iterator<String> iter = map.keySet().iterator();
            while(iter.hasNext()){
                if(map.get(car) > map.get(iter.next())){
                    count++;
                    break;
                }
            }
            map.remove(car);
        }

        System.out.println(count);
        br.close();
    }
}