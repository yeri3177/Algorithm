import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack;
        String str;
        int length;
        StringBuilder sb = new StringBuilder();
        boolean ans;

        for (int i = 0; i < N; i++) {
            ans = true;
            str = br.readLine();
            length = str.length();
            stack = new Stack<>();

            for(char x : str.toCharArray()){
                if(x == '(') {
                    stack.push(x);
                }
                else {
                    if(stack.empty()) {
                        ans = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if(ans == false || !stack.empty()) sb.append("NO" + "\n");
            else sb.append("YES" + "\n");

        }
        System.out.println(sb);
        br.close();
    }
}