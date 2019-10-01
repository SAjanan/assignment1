package assignment1;

import java.util.Arrays;

public class q6 {
		   public static void main(String args[]){
		      int array[] = {21,323,334,35,54,657,434};
		      int size = array.length;
		      Arrays.sort(array);
		      System.out.println("Array :"+Arrays.toString(array));
		      int secBE = array[size-2];
		      System.out.println("2nd largest element is :"+secBE);
		   }
		}
