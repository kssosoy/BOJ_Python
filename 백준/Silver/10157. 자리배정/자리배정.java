import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int c= Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(bf.readLine());
        int[][] map = new int[r][c];
        int [] dx = {-1,0,1,0};
        int [] dy = {0,1,0,-1};
        int count=1;
        int x=r-1, y=0, dir=0;
        if (k>c*r){
            System.out.println(0);
            return;
        }
        map[x][y]=count;
        while(count<k){
            int nx = x + dx[dir];
            int ny = y + dy[dir];


            if(nx<0  || nx>=r || ny<0 || ny>=c || map[nx][ny]!=0){
                dir=(dir+1)%4;
                nx=x+dx[dir];
                ny=y+dy[dir];
        }
            x=nx;
            y=ny;
            count++;
            map[x][y]=count;


        }
        System.out.println((y+1)+" "+(r-x));



    }
}