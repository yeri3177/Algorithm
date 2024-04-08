import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * [문제] 좌표 압축
 -----------------------------------------
 * 1.좌표들을 입력받은 순으로 저장하는 정수 배열을 선언 및 초기화한다.
 * 2.입력받은 좌표들을 오름차순으로 정렬하는 정수 배열을 만든다.
 * 3.좌표 오름차순으로 순위를 매겨서 저장할 map을 만든다.
 * key는 좌표 숫자, value는 등수로 한다.
 * 4.좌표 입력순으로 받은 배열에서 숫자를 하나씩 꺼내서
 * map에서 숫자를 통해 순위를 찾아 정답 문자열에 추가한다.
 -----------------------------------------
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력용
        StringBuilder sb = new StringBuilder();

        // 좌표 개수 N 입력받기
        int N = Integer.parseInt(br.readLine());

        // 좌표들 문자열을 StringTokenizer에 담기
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];

        // 좌표들 입력순으로 정수 배열에 넣기
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        // key : 좌표 숫자, value: 등수
        Map<Integer, Integer> map = new HashMap<>();

        // 순위 0부터 시작
        int rank = 0;

        // 숫자 정렬된 배열에서 하나씩 꺼내서 map에 숫자와 등수 넣기
        for(int num : sortedArr){
            if(!map.containsKey(num)){
                map.put(num, rank++);
            }
        }

        // 입력받은 좌표순으로 등수를 찾아서 sb에 담기
        for(int num : arr){
            sb.append(map.get(num)).append(" ");
        }

        // 정답 문자열 출력
        System.out.println(sb);

        // 입력용 BufferedReader 닫기
        br.close();
    }
}