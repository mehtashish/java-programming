package questions;

import java.util.Scanner;

public class Special_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int j=0; j<N; j++) {
			boolean isSpecial = false;
			for(int k=0; k<N; k++) {
				if(j != k && arr[j] % arr[k] == 0) {
					isSpecial = true;
					break;
				}
			}
			
			if(isSpecial) count++;
		}
		System.out.print(count);
	}
}
