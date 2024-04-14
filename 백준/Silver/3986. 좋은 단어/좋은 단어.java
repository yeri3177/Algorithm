import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Stack<Character> stack = new Stack<Character>();
        int answer = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                if (!stack.isEmpty() && str.charAt(j) == stack.peek())
                    stack.pop();
                else
                    stack.push(str.charAt(j));
            }
            if (stack.size() == 0) answer++;
            stack.clear();
        }

        System.out.println(answer);
        br.close();
    }
}