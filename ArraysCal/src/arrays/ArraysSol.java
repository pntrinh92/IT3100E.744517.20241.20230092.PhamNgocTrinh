package arrays;
import java.util.Scanner;

public class ArraysSol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int x = arr[i];
					arr[i] = arr[j];
					arr[j] = x;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		double avg = (double) sum/n;
		
		System.out.println("Sorted array: ");
		for (int i = 0; i <n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
	}
}
