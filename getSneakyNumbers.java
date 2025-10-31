import java.util.*;
public class getSneakyNumbers{
	public static void getSneakyNumbers(int[] nums){
		//brute force method
		List<Integer> ans=new ArrayList<>();
		Map<Integer,Integer> frequency=new HashMap<>();
		for(int i:nums){
			if(frequency.containsKey(i)){
				frequency.put(i,frequency.get(i)+1);
			}
			else{
				frequency.put(i,1);
			}
		}
		frequency.forEach((element,count)->{
			if(count>1){
				ans.add(element);
			}
		});
		System.out.println(ans);
    }
    public static void getSneakyNumbers1(int[] nums){
    	int n=nums.length;
    	boolean[] a=new boolean[n];//create boolean array with array size with all value false
    	int[] ar=new int[2];//create result array of size 2
    	int k=0;
    	for(int i=0;i<n;i++){
    		if(a[nums[i]]==true){
    			ar[k++]=nums[i];
    		}
    		else{
    			a[nums[i]]=true;
    		}
    	}
    	if(ar[0]>ar[1]){
    		k=ar[0];
    		ar[0]=ar[1];
    		ar[1]=k;
    	}
    	System.out.println(Arrays.toString(ar));

    }
	public static void main(String[] args) {
		int[] nums={0,3,2,1,3,2};
		getSneakyNumbers(nums);
		getSneakyNumbers1(nums);
	}
}