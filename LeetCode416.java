/*
 * 416. Partition Equal Subset Sum
Solved
Medium
Topics
premium lock icon
Companies
Given an integer array nums, return true if you can partition the array into two subsets such that the sum of the elements in both subsets is equal or false otherwise.

 

Example 1:

Input: nums = [1,5,11,5]
Output: true
Explanation: The array can be partitioned as [1, 5, 5] and [11].
Example 2:

Input: nums = [1,2,3,5]
Output: false
Explanation: The array cannot be partitioned into equal sum subsets.
 */
public class LeetCode416 {
    public static boolean isPartition(int[] arr){
        int totalSum=0;
        for(int n:arr)totalSum+=n;
        if(totalSum%2!=0) return false;
        int targetSum=totalSum/2;
        boolean[] dp=new boolean[targetSum+1];
        dp[0]=true;
        for(int n:arr){
            for(int currSum=targetSum;currSum>=n;currSum--){
                dp[targetSum]=dp[currSum]||dp[currSum-n];
                if(dp[targetSum]) return true;

            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,5,5,11};
        System.out.println(isPartition(arr));
    }
}
