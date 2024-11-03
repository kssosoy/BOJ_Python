import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i=1; i<=a; i++){
            st = new StringTokenizer(br.readLine());
            int b= Integer.parseInt((st.nextToken()));
            int c = Integer.parseInt((st.nextToken()));
            System.out.println("Case #"+i+": "+b+" + "+c+" = "+(b+c));
        }
        br.close();


    }
}