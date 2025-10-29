import java.util.*;
public class arrayleaders{
	public static void main(String[] args){
		int[] arr={16, 17, 4, 3, 5, 2};
		int len=arr.length;
		// int max=-1;
		// for(int i=len-1;i>=0;i--){
		// 	max=Math.max(arr[i],arr[i]=max);
		// }
		// for(int i:arr)
		// 	System.out.println(i);
		ArrayList<Integer> ans=new ArrayList<>();
		int maxval=-1;
		//System.out.println(len);
		for(int i=0;i<len;i++){
			int j;
			for(j=i+1;j<len;j++){
				if(arr[i]<arr[j]){
					break;
				}
				//System.out.println(arr[i]);
				//System.out.println(arr[j]);

				// if(arr[i]<arr[j]){
				// 	break;
				// }
				// if(j==len){
				// 	ans.add(arr[i]);
				// }
			}
			if(j==len){
				ans.add(arr[i]);
			}
		}
		System.out.println(ans);
	}
}