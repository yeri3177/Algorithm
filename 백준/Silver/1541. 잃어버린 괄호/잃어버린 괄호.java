import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();

        String[] subExpressions = expression.split("-"); // '-'를 기준으로 수식을 분할

        int total = calculate(subExpressions[0]); // 첫 번째 수식은 양수로 시작
        for (int i = 1; i < subExpressions.length; i++) {
            total -= calculate(subExpressions[i]); // 나머지 수식은 모두 뺄셈 연산
        }

        System.out.println(total); // 결과 출력
        br.close();
    }

    // 수식을 계산하여 결과를 반환하는 메서드
    private static int calculate(String expression) {
        String[] numbers = expression.split("\\+"); // '+'를 기준으로 숫자를 분할
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number); // 덧셈 연산
        }
        return sum;
    }
}