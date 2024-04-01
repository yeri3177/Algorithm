import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 1이상 100이하
        char[][] matrix = new char[N][N]; // String? char?
        int count_row = 0;
        int count_col = 0;
        int cell_row = 0;
        int cell_col = 0;

        for (int row = 0; row < N; row++) {
            String str = br.readLine();
            for (int col = 0; col < N; col++) {
                matrix[row][col] = str.charAt(col);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(matrix[i][j] == '.') cell_row++;
                if(matrix[i][j] == 'X' || (j == N-1)) {
                    if (cell_row >= 2) count_row++;
                    cell_row = 0;
                }

                if(matrix[j][i] == '.') cell_col++;
                if(matrix[j][i] == 'X' || (j == N-1)) {
                    if (cell_col >= 2) count_col++;
                    cell_col = 0;
                }
            }
        }
        System.out.println(count_row + " " + count_col);
        br.close();
    }
}