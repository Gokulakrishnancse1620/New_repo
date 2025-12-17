import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervalsGFG {
  public static void main(String[] args) {
    int[][] arr={{6,8},{1,9},{2,4},{4,7}};
    Arrays.sort(arr,(a,b)->a[0]-b[0]);
    ArrayList<int[]> ans=new ArrayList<>();
    int start=arr[0][0];
    int end=arr[0][1];
    for(int i=1;i<arr.length;i++){
        if(end>=arr[i][0]){
            end=Math.max(end,arr[i][1]);
        }
        else{
            ans.add(new int[]{start,end});
            start=arr[i][0];
            end=arr[i][1];

        }
    }
    ans.add(new int[]{start,end});
    for(int[] i:ans){
        System.out.print(Arrays.toString(i));
    }

  }  
}
