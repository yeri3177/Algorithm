import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(solution(a,b,c));
    }

    public static int solution(int a, int b, int c){
        int answer = 0;

        if(a == b && b == c){
            return 10000 + a*1000;
        }else if(a == b || b == c || a == c){
            return 1000 + (a==b?a:c)*100;
        }else{
            return Math.max(a,Math.max(b,c))*100;
        }
    }
}