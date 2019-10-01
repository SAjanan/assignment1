package assignment1;

public class q2 {

	public static void main(String[] args) {
		int a = 123;
		int b= 456;
		
		System.out.println("Before swapping : " +a +" "+ b);
		
		Swap(a,b);
	}
 private static void Swap(int a , int b) {
	 
	 
	int temp = a;
	 a = b;
	 b = temp;
	 
	 System.out.println("After swapping : " + a+ " " + b);
 }
	 
 }

