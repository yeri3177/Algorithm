import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] score = new int[cnt];
        int i = 0;
        while (st.hasMoreTokens()) {
            score[i++] = Integer.parseInt(st.nextToken());
        }

        double max = Arrays.stream(score).max().getAsInt();
        double sum = 0;
        for (int sco : score) {
            sum += sco/max*100;
        }

        System.out.println(sum/cnt);
    }
}