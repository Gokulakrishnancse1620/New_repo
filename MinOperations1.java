/*2654. Minimum Number of Operations to Make All Array Elements Equal to 1
 * 
 * You are given a 0-indexed array nums consisiting of positive integers. You can do the following operation on the array any number of times:

Select an index i such that 0 <= i < n - 1 and replace either of nums[i] or nums[i+1] with their gcd value.
Return the minimum number of operations to make all elements of nums equal to 1. If it is impossible, return -1.

The gcd of two integers is the greatest common divisor of the two integers.

 

Example 1:

Input: nums = [2,6,3,4]
Output: 4
Explanation: We can do the following operations:
- Choose index i = 2 and replace nums[2] with gcd(3,4) = 1. Now we have nums = [2,6,1,4].
- Choose index i = 1 and replace nums[1] with gcd(6,1) = 1. Now we have nums = [2,1,1,4].
- Choose index i = 0 and replace nums[0] with gcd(2,1) = 1. Now we have nums = [1,1,1,4].
- Choose index i = 2 and replace nums[3] with gcd(1,4) = 1. Now we have nums = [1,1,1,1].
Example 2:

Input: nums = [2,10,6,14]
Output: -1
Explanation: It can be shown that it is impossible to make all the elements equal to 1.
 

Constraints:

2 <= nums.length <= 50
1 <= nums[i] <= 106
 */

public class MinOperations1 {
    public static void main(String[] args) {
        int[] nums={2,6,3,4};
        int len=nums.length;
        int one=0;
        int g=0;
        for(int i:nums){
            if(i==1){
                one++;
            }
            g=gcd(g,i);
        }
            if(one>0){
                System.out.println(len-one);
                return;
            }
            if(g>1){
                System.out.println(-1);
                return;
            }
        
        int minlen=len;
        for(int i=0;i<len;i++){
            int curr=0;
            for(int j=i;j<len;j++){
                curr=gcd(curr,nums[j]);
                if(curr==1){
                    minlen=Math.min(minlen,j-i+1);
                }
            }
        }
        System.out.println(minlen+len-2);

    }
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
