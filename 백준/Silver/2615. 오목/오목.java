import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] checkerboard;
    static int winner = 0;
    static int x;
    static int y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 배열에 바둑판 담기
        checkerboard = new int[21][21]; // 인덱스 1~19
        for (int row = 1; row <= 19; row++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int col = 1; col <= 19; col++) {
                checkerboard[row][col] = Integer.parseInt(st.nextToken());
            }
        }

//        System.out.println(Arrays.deepToString(checkerboard));

        // 오목인지 확인
        for (int row = 1; row <= 19; row++) {
            for (int col = 1; col <= 19; col++) {
                if(checkerboard[row][col] == 0) {
                    continue;
                }
                else{
                    if(solve(row, col)) break;
                }
            }
        }
        if (winner == 0) {
            System.out.println(winner);
        }else{
            System.out.println(winner+"\n"+x+" "+y);
        }
    }

    static boolean solve(int row, int col) {
        int val = checkerboard[row][col];

        // 오목 |
        if(row+4<=19){
            if(checkerboard[row+1][col] == val
                    && checkerboard[row+2][col] == val
                    && checkerboard[row+3][col] == val
                    && checkerboard[row+4][col] == val
                    && checkerboard[row-1][col] != val
                    && checkerboard[row+5][col] != val
            ){
                x = row;
                y = col;
                winner = val;
                return true;
            }
        }
        // 오목 ㅡ
        if(col+4<=19){
            if(checkerboard[row][col+1] == val
                    && checkerboard[row][col+2] == val
                    && checkerboard[row][col+3] == val
                    && checkerboard[row][col+4] == val
                    && checkerboard[row][col-1] != val
                    && checkerboard[row][col+5] != val
            ){
                x = row;
                y = col;
                winner = val;
                return true;
            }
        }
        // 오목 \
        if(row+4<=19 && col+4<=19){
            if(checkerboard[row+1][col+1] == val
                    && checkerboard[row+2][col+2] == val
                    && checkerboard[row+3][col+3] == val
                    && checkerboard[row+4][col+4] == val
                    && checkerboard[row-1][col-1] != val
                    && checkerboard[row+5][col+5] != val
            ){
                x = row;
                y = col;
                winner = val;
                return true;
            }
        }

        // 오목 /
        if(row+4<=19 && col-4>=1){
            if(checkerboard[row+1][col-1] == val
                    && checkerboard[row+2][col-2] == val
                    && checkerboard[row+3][col-3] == val
                    && checkerboard[row+4][col-4] == val
                    && checkerboard[row-1][col+1] != val
                    && checkerboard[row+5][col-5] != val
            ){
                x = row+4;
                y = col-4;
                winner = val;
                return true;
            }
        }
        return false;
    }
}