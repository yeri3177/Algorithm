import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        solution(count);
    }

    public static void solution(int count){
        for (int i = 1; i <= count; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            for (int b = count-i; b > 0; b--) {
                System.out.print(" ");
            }

            for (int b = count-i; b > 0; b--) {
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < count; i++) {
            for (int a = count-1; a >= i; a--) {
                System.out.print("*");
            }
            for (int b = 1; b <= i; b++) {
                System.out.print(" ");
            }

            for (int b = 1; b <= i; b++) {
                System.out.print(" ");
            }
            for (int a = count-1; a >= i; a--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
