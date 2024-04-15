import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int count1 = 0;
    static int count2 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        fib(N);
        fibonacci(N);

        System.out.println(count1 + " " + count2);
        br.close();
    }
    // 피보나치 수 재귀호출
    static int fib(int n){
        if(n == 1 || n == 2){
            count1++;
            return 1;
        }
        else return (fib(n-1) + fib(n-2));
    }
    //피보나치 수 동적 프로그래밍 코드
    static int fibonacci(int n){
        int[] f = new int[n+1];
        f[1] = 1;
        f[2] = 1;

        for(int i = 3; i <= n; i++){
            count2++;
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}