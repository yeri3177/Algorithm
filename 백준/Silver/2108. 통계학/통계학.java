import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

//        HashMap<Integer, Integer> map = new HashMap<>(); // 최빈값용 map
        int sum = 0; // 산술평균용 합계

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;

            sum += num; // 합계 구하기
//            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 배열 오름차순 정렬
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        sb.append(Math.round((double) sum / N) + "\n"); // 산술평균 담기
        sb.append(arr[N / 2] + "\n"); // 중앙값 담기
        sb.append(solve(arr) + "\n"); // 최빈값 담기
        sb.append(arr[N - 1] - arr[0]); // 범위 담기
        System.out.println(sb);
        br.close();
    }

    // 최빈값 구하기
    static int solve(int[] arr){
        int answer = 0;
        int length = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>(); // 최빈값용 map

        // 주어진 값이 1개면, 그 값을 리턴함
        if(length == 1) return arr[0];

        for (int i = 0; i < length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

//        System.out.println(map);
        List<Integer> keySet = new ArrayList<>(map.keySet());

        // keySet 정렬
        Collections.sort(keySet); // key 기준 오름차순
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1))); // value 기준 내림차순

        Iterator iterator = keySet.iterator();
        int a = (int) iterator.next();
        int b = (int) iterator.next();
//        System.out.println(a + " : " + b);
//        System.out.println("test : " + (a == b));
        answer = (map.get(a) == map.get(b))? b : a;


        return answer;
    }
}