import java.util.Stack;

public class MinOperations {
    public static void main(String[] args) {
        //nt[] arr={0,2};
        // int[] arr={3,1,2,1};
        int[] arr={1,2,1,2,1,2};
        Stack<Integer> stack=new Stack<>();
        int operation=0;
        for(int i:arr){
            while(!stack.isEmpty()&&i<stack.peek()){
                stack.pop();
            }
            if(i==0) continue;
            if(stack.isEmpty()||i>stack.peek()){
                stack.push(i);
                operation++;
            }
        }
        System.out.println(operation);
    }
}
