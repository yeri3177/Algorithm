import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
    }

    public static void solution(String str){
        String[] week = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] monthOfDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] input = str.split(" ");
        int month = Integer.valueOf(input[0]);
        int day = Integer.valueOf(input[1]);
        int days = 0;

        // 일수 구하기
        for(int i=1; i<month; i++){
            days += monthOfDays[i-1];
        }
        days += day;
        
        // 요일 구하기
        System.out.println(week[days%7]);
    }
}