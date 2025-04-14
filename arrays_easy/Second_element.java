//Problem Statement: Given an array, find the second smallest and second largest element in the array.
//		   		     Print ‘-1’ in the event that either of them doesn’t exist.

package arrays_easy;

import java.util.Arrays;
import java.util.Scanner;

public class Second_element {
	// Brute Force Approach
	static int[] second_elements(int arr[]) {
		if(arr.length < 3) {
			return new int[] {-1, -1};
		}
		
		Arrays.sort(arr);
		int secondSmallest = arr[1];
		int secondLargest = arr[arr.length-2];
		
		return new int[] {secondSmallest, secondLargest};
	}
	
	// Optimal Approach
	static int[] second_elements(int arr[], int size) {
		if(size < 3) return new int[] {-1,-1};
		
		int smallest = arr[0];
		int largest = arr[0];
		
		int secondSmallest = Integer.MAX_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i = 1; i<size; i++) {
			if(arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if(arr[i] > smallest && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		
		for(int i = 1; i<size; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if(arr[i] < largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		
		return new int[] {secondSmallest, secondLargest};
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
//		int elements[] = second_elements(arr);
		int elements[] = second_elements(arr, size);
		
		System.out.println("Second smallest: " + elements[0]);
		System.out.println("Second largest: " + elements[1]);
	}
}