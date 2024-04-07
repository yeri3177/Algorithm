import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 풍선 개수

        Deque<int[]> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder(); // 출력용 문자열
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N]; // 풍선 숫자 담을 배열
        for(int i=0; i<N; i++) { // 배열에 숫자 담기
            arr[i] = Integer.parseInt(st.nextToken());
        }


        // 덱에 풍선의 위치, 숫자가 있는 정수 배열 넣기
        for(int i = 0; i < N; i++){
            deque.add(new int[] {(i+1), arr[i]});
        }

        // 덱에서 첫번째부터 마지막-1까지 반복
        while(deque.size() > 1) {
            int[] balloon = deque.poll(); // 앞에꺼 빼기
            int num = balloon[1]; // 풍선에 적힌 숫자
            sb.append(balloon[0]).append(" "); // 위치값 넣기

            // 양수인 경우
            if(num > 0) {
                // 순서 뒤로 돌리기
                for(int i = 1; i < num; i++) {
                    deque.add(deque.poll());
                }
            }

            // 음수인 경우
            else {
                for(int i = 1; i <= -num; i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        // 마지막 풍선 넣기
        int[] balloon = deque.poll();
        sb.append(balloon[0]);

        System.out.println(sb.toString());
    }
}