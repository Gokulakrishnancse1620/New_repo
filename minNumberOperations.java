public class minNumberOperations{
	public static int operation(int[] arr){
		int current=arr[0];//initial value
		int n=arr.length;
		for(int i=1;i<n;i++){//iterate from 1 to n
			if(arr[i]>arr[i-1]){//check current element is greater than previous element
				current+=arr[i]-arr[i-1];//add difference between current element and previous element to result
			}

		}
		return current;
	}
	public static void main(String[] args) {
		int[] arr={1,2,3,2,1};
		System.out.println(operation(arr));
	}
}