import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        solution(num);
    }

    public static void solution(int n){
        int line = 1;

        while (n > line) {
            n -= line;
            line += 1;
        }

        if(line%2 == 0){
            System.out.println(n + "/" + (line-n+1));
        }else{
            System.out.println((line-n+1) + "/" + n);
        }
    }
}