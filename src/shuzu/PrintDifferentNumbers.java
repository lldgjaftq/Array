package shuzu;

import java.util.Scanner;

public class PrintDifferentNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[]  numbers1 = new int[10];
		int[]  numbers2 = new int[10];

		System.out.print("Enter 10 numbers: ");
		for (int i = 0;i<10;i++) {
			numbers1[i] = input.nextInt();
		}
		for (int j = 0;j<10;j++) {
			numbers2[j] = 0;
		}
		int t=0;
		for(int i=0;i<10;i++) {
			int f=1;
			for(int j=0;j<10;j++) {
				if(numbers1[i]==numbers2[j]) {
					f=0;
				}	
			}
			if(f==1) {
				numbers2[t]=numbers1[i];
				t++;
			}
		}
		System.out.println("The number of distinct numbers is " + t);
		System.out.print("The distinct numbers are: ");
		for (int i=0;i<t;i++) {
			System.out.print(numbers2[i] + " ");
		}	
	}
}
