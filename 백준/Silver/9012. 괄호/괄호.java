import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력용
        StringBuilder sb = new StringBuilder(); // 출력용
        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        String str;
        int length;
        boolean check;

        for (int i = 0; i < N; i++) {
            check = true;
            str = br.readLine();
            length = str.length();

            for(char x : str.toCharArray()){
                if(x == '(') {
                    stack.push(x);
                }
                else {
                    if(stack.empty()) {
                        check = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if(check == false || !stack.empty()) sb.append("NO" + "\n");
            else sb.append("YES" + "\n");
            stack.clear();
        }
        System.out.println(sb);
        br.close();
    }
}