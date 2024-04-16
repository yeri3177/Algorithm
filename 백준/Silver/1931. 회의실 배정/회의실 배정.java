import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 회의의 수

        int[][] meetings = new int[N][2]; // 회의 정보를 저장할 배열
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meetings[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
            meetings[i][1] = Integer.parseInt(st.nextToken()); // 종료 시간
        }

        // 종료 시간을 기준으로 오름차순 정렬
        Arrays.sort(meetings, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0]; // 종료 시간이 같으면 시작 시간이 빠른 순으로 정렬
                }
                return o1[1] - o2[1];
            }
        });

        int count = 0; // 최대 회의 수
        int endTime = 0; // 이전 회의의 종료 시간
        for (int i = 0; i < N; i++) {
            if (meetings[i][0] >= endTime) { // 현재 회의의 시작 시간이 이전 회의의 종료 시간보다 크거나 같으면 선택 가능
                endTime = meetings[i][1]; // 이전 회의의 종료 시간을 현재 회의의 종료 시간으로 업데이트
                count++; // 회의 수 증가
            }
        }

        System.out.println(count); // 결과 출력
        br.close();
    }
}