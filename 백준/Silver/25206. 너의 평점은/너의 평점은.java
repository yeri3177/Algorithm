import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

//        String str[] = new String[20];
        double totalSum = 0;
        double scoreSum = 0;
        String gradeList[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"}; // 등급
        double gradeScore[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0}; // 등급별 점수

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());

            st.nextToken(); // 과목명
            double score = Double.parseDouble(st.nextToken()); // 학점
            String grade = st.nextToken(); // 등급

            for (int j = 0; j < 9; j++) {
                if (grade.equals(gradeList[j])) {
                    totalSum += score * gradeScore[j];
                    scoreSum += score;
                }
            }
        }

        double average = totalSum / scoreSum;
        System.out.printf("%.6f", average);
        br.close();
    }
}