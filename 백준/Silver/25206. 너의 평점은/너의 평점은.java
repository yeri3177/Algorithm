import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[20];

        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextLine();
        }

        double myGrade = 0;
        double gradeSum = 0;

        for(int i=0; i<20; i++){
            String[] str = arr[i].split(" ");

            double grade = Double.valueOf(str[1]);
            String point = str[2];

            switch (point){
                case "A+":
                    myGrade += 4.5 * grade;
                    gradeSum += grade;
                    break;
                case "A0":
                    myGrade += 4.0 * grade;
                    gradeSum += grade;
                    break;
                case "B+":
                    myGrade += 3.5 * grade;
                    gradeSum += grade;
                    break;
                case "B0":
                    myGrade += 3.0 * grade;
                    gradeSum += grade;
                    break;
                case "C+":
                    myGrade += 2.5 * grade;
                    gradeSum += grade;
                    break;
                case "C0":
                    myGrade += 2.0 * grade;
                    gradeSum += grade;
                    break;
                case "D+":
                    myGrade += 1.5 * grade;
                    gradeSum += grade;
                    break;
                case "D0":
                    myGrade += 1.0 * grade;
                    gradeSum += grade;
                    break;
                case "F":
                    myGrade += 0.0 * grade;
                    gradeSum += grade;
                    break;
            }
        }

        System.out.println(myGrade/gradeSum);

    }
}