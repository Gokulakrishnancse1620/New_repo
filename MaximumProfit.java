//https://www.geeksforgeeks.org/problems/weighted-job-scheduling/1
/*Input: jobs[][] =  [[1, 2, 50], 
                 [3, 5, 20],
                 [6, 19, 100],
                 [2, 100, 200]] 
Output: 250
Explanation: The first and fourth jobs with the time range [1, 2] and [2, 100] can be chosen to give maximum profit of 50 + 200 = 250.*/
class Solution {
    public int MaximumProfit(int[][] jobs) {
        // code here
        Arrays.sort(jobs,(a,b)->a[1]-b[1]);//sort array on 1 based index
        int n=jobs.length;
        int dp[]=new int[n];//create DP array to store the current maximum weight
        int ans=0;
        for(int i=0;i<n;i++){
            int s=0,e=i;
            while(s<=e){//binary search for non-overlap value
               int m=(s+e)/2;
                if(jobs[m][1]<=jobs[i][0]){
                    s=m+1;
                }
                else{
                    e=m-1;
                }
            }
            int curr=jobs[i][2];
            if(e!=-1)curr+=dp[e];//if end not equal to -1 then the non overlap value finded store the weight in dp
            
            if(ans<curr)ans=curr;//find max value and store in ans
            dp[i]=ans;//update the ans in dp array
        }
        return ans;        
    }
}
