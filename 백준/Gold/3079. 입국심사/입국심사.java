import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입국심사대 수
        long N = Long.parseLong(st.nextToken());
        // 친구 수
        long M = Long.parseLong(st.nextToken());

        // 심사시간을 담는 정수 배열
        long[] time = new long[(int) N];

        // 심사시간 최소값, 최대값
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        // 심사시간을 배열에 담으면서 최소값, 최대값 구하기
        for (int i = 0; i < N; i++) {
            time[i] = Long.parseLong(br.readLine());

            min = Math.min(min, time[i]);
            max = Math.max(max, time[i]);
        }

        // 친구들이 심사받는데 걸리는 총시간
        // start = 심사시간 최소값
        // end = 심사 최대시간 * 친구수
        long start = min;
//        long start = 0;
        long end = max * M;

        while (start <= end) {
            // 중간값
            long mid = (start + end) / 2;

            // 총 몇명 심사 받을 수 있는지 카운트
            // 친구수 M과 비교
            long pass = 0;

            // 임의의 총 심사시간에 심사시간들을 나눈다.
            // 총 몇명 처리 가능한지 카운트한다.
            for (int i = 0; i < N; i++) {
                if(pass >= M) break;

                pass += mid / time[i];
            }

            // 심사가능한 사람수보다 심사할친구수가 크면
            // 심사총시간이 커져야 하므로 시작값을 올린다.
            if (pass < M) {
                start = mid + 1;
            }
            // 반대의 경우는 심사시간을 작아지기 위해 종료값을 낮춘다.
            else {
                end = mid - 1;
            }
        }

        // 최소시간 출력
        System.out.println(start);
        br.close();
    }
}