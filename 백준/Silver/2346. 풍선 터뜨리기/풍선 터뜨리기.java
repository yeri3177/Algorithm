import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Balloon {
    int index; // 풍선 자리 위치
    int value; // 풍선에 적힌 숫자

    public Balloon(int index, int value) {
        this.index = index;
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 출력용 문자열
        Deque<Balloon> deque = new ArrayDeque<>(); // 풍선담을용으로 덱 사용
        int n = Integer.parseInt(br.readLine()); // 풍선 개수
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 1; i <= n; i++){ // 자리는 1부터 n까지
            // 덱에 풍선 넣기
            deque.offer(new Balloon(i, Integer.parseInt(st.nextToken())));
        }

        // 풍선에 나온숫자를 맨앞자리로 위치하여 빼내는 방법
        while(deque.size() > 1){
            Balloon b = deque.poll(); // 앞에꺼 빼기
            int m = b.value; // 풍선에 적힌 숫자
            sb.append(b.index).append(" "); // 위치값 넣기

            if(m > 0){ // 양수이면 오른쪽으로 이동
                for(int i = 0; i < m-1; i++){
                    Balloon tmp = deque.poll(); // 앞에서 빼서
                    deque.offer(tmp); // 뒤에 넣기
                }
            }
            else if(m < 0){ // 음수이면 왼쪽 이동
                for(int i = 0; i < Math.abs(m); i++){
                    Balloon tmp = deque.pollLast(); // 뒤에서 빼서
                    deque.offerFirst(tmp); // 앞에 넣기
                }
            }
        }

        Balloon m = deque.poll(); // 마지막값
        sb.append(m.index); // 마지막값 위치 넣기

        System.out.println(sb);
    }
}