import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.SplittableRandom;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int r= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());
        char[][]map = new char[r][c];
        char[][]map2 = new char[r][c];
        for(int i=0; i<r; i++){
            String s = bf.readLine();
            for(int j=0; j<c; j++){
                map[i][j]=s.charAt(j);
                map2[i][j]=s.charAt(j);
            }
        }
        int[]dx = {0,0,-1,1};
        int[]dy={-1,1,0,0};
        for(int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                if(map[i][j]=='X'){
                    int count=0;
                    for(int k=0; k<4; k++){
                        int nx= i+dx[k];
                        int ny=j+dy[k];
                        if(nx<0 || ny<0 || nx>=r || ny>=c|| map[nx][ny]=='.'){
                            count++;
                        }
                    }
                    if (count>=3){
                        map2[i][j]='.';
                    }
                }
            }
        }
        int minX = r, minY = c, maxX = -1, maxY = -1;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (map2[i][j] == 'X') {
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }
        }


        for (int i = minX; i <= maxX; i++) {
            for (int j = minY; j <= maxY; j++) {
                System.out.print(map2[i][j]);
            }
            System.out.println();
        }

    }

}
