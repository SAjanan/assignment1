package assignment1;

import java.io.*;
import java.util.*;

public class q5 {
public static boolean areEqual
 	(int arr1[] , int arr2[])
 	{
	int n = arr1.length;
	int m = arr2.length;
	if (n!=m)
		return false;
	for (int i=0 ; i<n; i++)
		if ( arr1[i] != arr2[i] )
			return false;
	return true;
 
 	}
	public static void main(String[] args) {
		int arr1[] = {11,323,32,131,313,131};
		int arr2[] = {13,345,546,662,6354,124};
		if (areEqual(arr1,arr2))
			System.out.println("Arrays are eqal elements");
		else
			System.out.println("Arrays are not equal elements");
		

	}

}
