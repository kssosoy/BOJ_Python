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

        List<Integer> candidate = makeCadidate();
        int n = Integer.parseInt(bf.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int min = Integer.parseInt(st.nextToken());
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            Iterator<Integer> it = candidate.iterator();
            while (it.hasNext()) {
                int num = it.next();
                if (!isCheck(num, min, strike, ball)) {
                    it.remove();
                }
            }




        }
        System.out.println(candidate.size());



    }

    public static List<Integer> makeCadidate (){
        List<Integer> list = new LinkedList<>();
        for (int i=100; i<1000; i++){
            int a = i/100;
            int b = (i%100)/10;
            int c = i%10;
            if (a!=b && b!=c && c!=a && a!=0 && b!=0 && c!=0){
                list.add(i);
            }
        }
        return list;
    }

    public static boolean isCheck(int candidate, int target, int strike, int ball){
        String c = String.valueOf(candidate);
        String t = String.valueOf(target);

        int sc= 0;
        int bc=0;

        for(int i=0; i<3; i++){
            if (c.charAt(i) == t.charAt(i)) {
                sc++;
            }
        }

        for(int i=0; i<3; i++){
            if( c.contains(String.valueOf(t.charAt(i))) && c.charAt(i)!=t.charAt(i)){
                bc++;
            }
        }

        if(sc==strike && bc==ball){
            return true;
        }
        else{
            return false;
        }
    }

}
