import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if(".".equals(str)) break;

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if(c == '(' || c == '['){
                    stack.push(c);
                }

                if(c == ')'){
                    if(stack.empty()) {
                        stack.push(c);
                        break;
                    }

                    if(stack.peek() == '('){
                        stack.pop();
                    }else{
                        break;
                    }
                }

                if(c == ']'){
                    if(stack.empty()) {
                        stack.push(c);
                        break;
                    }

                    if(stack.peek() == '['){
                        stack.pop();
                    }else{
                        break;
                    }
                }
            }
            if(stack.isEmpty()) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}