import java.util.*;
public class arrayleaders{
	public static void main(String[] args){
		int[] arr={16, 17, 4, 3, 5, 2};
		int len=arr.length;
		ArrayList<Integer> ans=new ArrayList<>();
		/*for(int i=0;i<len;i++){//method 1
			int j;
			for(j=i+1;j<len;j++){
				if(arr[i]<arr[j]){
					break;
				}
			}
			if(j==len){
				ans.add(arr[i]);
			}
		}*/
		//method 2
		int large_value=arr[arr.length-1];
		ans.add(large_value);
		for(int i=arr.length-2;i>=0;i--){
			if(arr[i]>large_value){
				large_value=arr[i];
				ans.add(large_value);
			}
		}
		Collections.reverse(ans);

		System.out.println(ans);

	}
}