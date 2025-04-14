package arrays_easy;

import java.util.Arrays;
import java.util.Scanner;

public class Largest_element {
	// Brute Force Approach 
	static int largest(int arr[]) {
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}
	
	
	// Recursive Approach
	static int largest(int arr[], int size) {
		int max = arr[0];
		for(int i=1; i<size; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(largest(arr));			// for Brute Force Approach
		System.out.print(largest(arr, size));	// for Recursive Approach
	}
}