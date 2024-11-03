import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int N = Integer.parseInt(st.nextToken());
        st= new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<N; i++){
            int num=Integer.parseInt(st.nextToken());
            if (max<num){
                max=num;
            }
            if(min>num){
                min=num;
            }
        }

        System.out.println(min+" "+max);
        br.close();

    }
}