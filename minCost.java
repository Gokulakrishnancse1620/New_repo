public class minCost{
	public static void main(String[] args) {
		String colors="abaac";
		int[] neededTime={1,2,3,4,5};
		int ans=0;//totaltime
		int maxTime=neededTime[0],sum_Time=neededTime[0];
		for(int i=1;i<colors.length();i++){
			if(colors.charAt(i)==colors.charAt(i-1)){//check the same color in group
				sum_Time+=neededTime[i];//add the currenttime with preious time
				maxTime=Math.max(maxTime,neededTime[i]);//find max value in the same group
			}
			else{//the same group ends
				ans+=(sum_Time-maxTime);//subtract total value with max value
				maxTime=neededTime[i];//change max value with next group
				sum_Time=neededTime[i];//change total value with next group
			}
				
		}
		ans+=(sum_Time-maxTime);//check last group
		System.out.println(ans);
	}
}