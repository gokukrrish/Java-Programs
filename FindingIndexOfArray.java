package basics;

import java.util.stream.IntStream;

public class FindingIndexOfArray {
	
	 public static int findIndex(int arr[], int t)
	    {
	        int len = arr.length;
	        return IntStream.range(0, len)
	            .filter(i -> t == arr[i])
	            .findFirst() // first occurrence
	            .orElse(-1); // No element found
	    }

	public static void main(String[] args) {
		int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };
        System.out.println("Index position of 5 is: "
                           + findIndex(my_array, 5));
        System.out.println("Index position of 7 is: "
                           + findIndex(my_array, 7));
    }
	}


