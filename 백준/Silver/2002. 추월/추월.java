import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 차의 대수 N(1 ≤ N ≤ 1,000)
        int N = Integer.parseInt(br.readLine());

        // 추월하는차 카운트 하기
        int count = 0;

        // 1.터널에 차가 들어가는 순서대로 큐에 넣기
        Queue<String> enter = new LinkedList<>();
        for(int i=0; i<N; i++) {
            enter.add(br.readLine());
        }

        // 2.터널에 차가 나오는 순서대로 큐에 넣기
        Queue<String> exit = new LinkedList<>();
        for(int i=0; i<N; i++) {
            exit.add(br.readLine());
        }

        // 나가는 차가 담긴 큐가 비어있지 않을때까지 반복
        while(!exit.isEmpty()) {
            // 나가는차 앞에서 하나 빼기
            String car = exit.poll();

            // 나가는 차와 들어가는차가 같지 않으면
            if(!enter.peek().equals(car)) {
                count++; // 카운트 해주기
                enter.remove(car); // enter큐에 해당 차 지우기
            }
            // 나가는 차와 들어가는차가 같으면
            else {
                enter.poll(); // 앞에꺼 지우기
            }
        }

        // 추월한 차의 개수 출력
        System.out.println(count);
        br.close();
    }
}