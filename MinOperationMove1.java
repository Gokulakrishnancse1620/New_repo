import java.util.Arrays;

/*3228. Maximum Number of Operations to Move Ones to the End
 * ou are given a binary string s.

You can perform the following operation on the string any number of times:

Choose any index i from the string where i + 1 < s.length such that s[i] == '1' and s[i + 1] == '0'.
Move the character s[i] to the right until it reaches the end of the string or another '1'. For example, for s = "010010", if we choose i = 1, the resulting string will be s = "000110".
Return the maximum number of operations that you can perform.
 */
public class MinOperationMove1 {
    public static void main(String[] args) {
        String s="10";
        int operation=0;
        int one=0;
        boolean use=false;
        for(char c:s.toCharArray()){
            if(c=='0'){
                use =true;
            }
            else{
                if(use){
                    operation+=one;
                }
            
            one++;
            use =false;
        }
        }
        if(use){
            operation+=one;
        }
         System.out.println(operation);
    }
}
       
