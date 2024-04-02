import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int arrSize;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arrSize = Integer.parseInt(br.readLine()); // 스위치개수
        int[] arr = new int[arrSize+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= arrSize; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int studentsCnt = Integer.parseInt(br.readLine()); // 학생수
        for (int i = 0; i < studentsCnt; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            arr = solve(arr, gender, num);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= arrSize; i++) {
            sb.append(arr[i] + " ");
            if (i % 20 == 0) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
    static int[] solve(int[] arr, int gender, int num) {
        if (gender == 1) { // 남자
            for (int i = 1; ; i++) {
                if(i*num > arrSize) break;
                arr[i * num] = (arr[i * num] == 1 ? 0 : 1);
            }
        }
        else{ // 여자
            // num칸은 무조건 바꾸기
            if (num <= arrSize) {
                arr[num] = (arr[num] == 1 ? 0 : 1);
            }

            // num-i, num+i 대칭맞는지 봐서 바꾸기
            int i = 1;
            while (num - i >= 1 && num + i <= arrSize) {
                if(arr[num + i] == arr[num - i]){
                    arr[num - i] = (arr[num - i] == 1 ? 0 : 1);
                    arr[num + i] = (arr[num + i] == 1 ? 0 : 1);
                    i++;
                }else{
                    break;
                }
            }
        }
        return arr;
    }
}