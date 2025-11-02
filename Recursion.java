public class Recursion{
	public static void printNum(int n){
		if(n==0)
			return;//stop when n to zero
		System.out.print(n +" ");//print number from n to 1
		printNum(n-1);
		System.out.print(n +" ");//print number from 1 to n
	}
	public static void main(String[] args) {
		int n=10;
		//Recursion r=new Recursion();
		printNum(n);
	}
}