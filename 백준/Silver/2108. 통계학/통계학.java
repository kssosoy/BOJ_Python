import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        long result1=Math.round((float) Arrays.stream(arr).sum() /arr.length);
        System.out.println(result1);

        Arrays.sort(arr);
        int result2=arr[n/2];
        System.out.println(result2);

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxcount=0;
        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        maxcount=Collections.max(map.values());
        ArrayList<Integer> result3=new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==maxcount){
                result3.add(entry.getKey());
            }
        }
        Collections.sort(result3);
        if(result3.size()>=2){
            System.out.println(result3.get(1));
        }
        else{
            System.out.println(result3.get(0));
        }

        int result4=Arrays.stream(arr).max().getAsInt()-Arrays.stream(arr).min().getAsInt();
        System.out.println(result4);


    }
}

