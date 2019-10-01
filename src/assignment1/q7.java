package assignment1;

	import java.util.Scanner;
public class q7{
	  static int[] x= {9,3,6,1,5,2,2};
	  static int length=x.length;

	  public static void main(String[] args) {


	    System.out.print("array(x) elements before shifting :");
	    printarray(x);

	    Scanner scanner=new Scanner(System.in);
	    System.out.print("Please enter the Target(t) index: ");
	    int target=scanner.nextInt();

	    System.out.print("Please enter the destination(d) index: ");
	    int destination=scanner.nextInt();



	    if (length-1>=target && length-1>=destination && target>-1 && destination>-1) {

	      System.out.print("array(x) elements after shifting: ");

	      printarray(shiftingElements(target,destination));

	    }

	    else{
	      System.out.print("Sorry.incorrect options. ");
	    }

	  }

	  public static void printarray(int[] x){
	      for (int i=0;i<length;i++ ) {
	          System.out.print(x[i]+" ");
	      }
	      System.out.print("\n");
	      System.out.println("------------------------------------------------------");
	  }

	  public static int[] shiftingElements(int t,int d){
	      int temp=x[d];
	      x[d]=x[t];
	      x[t]=temp;
	      return x;
	  }

	}
