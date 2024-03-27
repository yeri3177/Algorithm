
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[count];

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextLine();
        }

        solution(arr);
    }

    public static void solution(String[] arr){

        for(int i=0; i<arr.length; i++){
            int cnt = Integer.valueOf(arr[i].substring(0, 1)); // 반복 횟수
            String str = arr[i].substring(2); // 문자열

            for (int j = 0; j < str.length(); j++) {

                for (int k = 0; k < cnt; k++) {
                    System.out.print(str.charAt(j));
                }

            }
            System.out.println();
        }
    }
}
