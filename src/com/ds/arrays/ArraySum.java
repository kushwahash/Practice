/*
 * */
package com.ds.arrays;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test_cases = scn.nextInt();
		for (int t = 0; t < test_cases; t++) {
			int sizeOfArray = scn.nextInt();
			//int arr[] = new int[sizeOfArray];
			int leftSum=0;
			int rightSum=0;
			for(int i=0;i<sizeOfArray/2;i++) {
				leftSum+=scn.nextInt();
			}
			for(int i=sizeOfArray/2;i<sizeOfArray;i++) {
				rightSum+=scn.nextInt();
			}
			
			System.out.println(rightSum*leftSum);
		}
	}
}
