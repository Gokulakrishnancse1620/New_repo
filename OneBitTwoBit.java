public class OneBitTwoBit {
    public static void main(String[] args) {
        int[] bits={1,1,0};
        int n=bits.length;
        int i=0;
        while(i<n-1){
            i+=1+bits[i];
        }
        System.out.println(i==n-1);
    }
    
}
