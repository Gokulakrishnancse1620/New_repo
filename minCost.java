public class minCost{
	public static void main(String[] args) {
		String colors="abaac";
		int[] neededTime={1,2,3,4,5};
		int ans=0;
		int maxTime=neededTime[0],sum_Time=neededTime[0];
		for(int i=1;i<colors.length();i++){
			if(colors.charAt(i)==colors.charAt(i-1)){
				sum_Time+=neededTime[i];
				maxTime=Math.max(maxTime,neededTime[i]);
			}
			else{
				ans+=(sum_Time-maxTime);
				maxTime=neededTime[i];
				sum_Time=neededTime[i];
			}
				
		}
		ans+=(sum_Time-maxTime);
		System.out.println(ans);
	}
}