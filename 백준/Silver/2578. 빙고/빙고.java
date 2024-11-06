import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] bingoBoard = new int[5][5];
        int[] calledNumbers = new int[25];

        // 빙고판 입력받기
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                bingoBoard[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 사회자가 부르는 숫자들 입력받기
        int idx = 0;
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                calledNumbers[idx++] = Integer.parseInt(st.nextToken());
            }
        }


        for (int i=0; i<calledNumbers.length; i++){
            markNumber(bingoBoard, calledNumbers[i]);
            if(checkBingo(bingoBoard)>=3){
                System.out.println(i+1);
                return;
            }
        }

        br.close();
    }
    private static void markNumber(int[][] bingoBoard, int number){
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (bingoBoard[i][j] == number){
                    bingoBoard[i][j] = 0;
                    return;
                }
            }
        }
    }

    // 빙고를 세는 함수
    private static int checkBingo(int[][] bingoBoard) {
        int bingoCount = 0;

        // 가로 빙고 체크
        for (int i = 0; i < 5; i++) {
            boolean rowBingo = true;
            for (int j = 0; j < 5; j++) {
                if (bingoBoard[i][j] != 0) {
                    rowBingo = false;
                    break;
                }
            }
            if (rowBingo) {
                bingoCount += 1;
            }
        }

        // 세로 빙고 체크
        for (int j = 0; j < 5; j++) {
            boolean colBingo = true;
            for (int i = 0; i < 5; i++) {
                if (bingoBoard[i][j] != 0) {
                    colBingo = false;
                    break;
                }
            }
            if (colBingo) {
                bingoCount += 1;
            }
        }

        // 왼쪽 위에서 오른쪽 아래 대각선 체크
        boolean crossBingo = true;
        for (int i = 0; i < 5; i++) {
            if (bingoBoard[i][i] != 0) {
                crossBingo = false;
                break;
            }
        }
        if (crossBingo) {
            bingoCount++;
        }

        // 오른쪽 위에서 왼쪽 아래 대각선 체크
        boolean r_crossBingo = true;
        for (int i = 0; i < 5; i++) {
            if (bingoBoard[i][4 - i] != 0) {
                r_crossBingo = false;
                break;
            }
        }
        if (r_crossBingo) {
            bingoCount++;
        }

        return bingoCount;
    }
}
