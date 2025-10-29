import java.util.*;
public class MergeIntervals{
	public static void main(String[] args) {
		int[][] arr={{1,3},{2,6},{8,10},{15,18}};
		List<int[]> ans=new ArrayList<>();
		int cols=0;
		Arrays.sort(arr,(a,b)->Integer.compare(a[cols],b[cols]));//to sort file using first value of array
		int[] prev=arr[0];
		for(int i=1;i<arr.length;i++){
			int[] curr=arr[i];
			if(curr[0]<=prev[1]){
				prev[1]=Math.max(prev[1],curr[1]);
			}
			else{
				ans.add(prev);
				prev=curr;
			}
		}
		ans.add(prev);
		for(int[] i:ans){
			System.out.println(Arrays.toString(i));
		}
	}
	
}