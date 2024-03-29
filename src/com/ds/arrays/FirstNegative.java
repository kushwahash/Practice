
package com.ds.arrays;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Given an array and a positive integer k, find the first negative integer for each and every window(contiguous subarray) of size k.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer n denoting the size of the array. The next line contains n space separated integers forming the array. The last line contains the window size k.

Output:
Print the space separated negative integer starting from the first till the end for every window size k. If a window does not contain a negative integer , then print 0 for that window.

Constraints:
1<=T<=10^5
1<=n<=10^5
1<=a[i]<=10^5
1<=k<=n

Example:
Input:
2
5
-8 2 3 -6 10
2
8
12 -1 -7 8 -15 30 16 28
3

Output:
-8 0 -6 -6
-1 -1 -7 -15 -15 0
 * */
public class FirstNegative {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test_cases = scn.nextInt();
		for (int t = 0; t < test_cases; t++) {
			int n = scn.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++) {
				a[i] = scn.nextInt();
			}
			int k = scn.nextInt();
			for(int i=0;i<n-k;i=i+k) {
				printNegative(i,i+k,a);
			}
			System.out.println();
		}
		scn.close();
	}
	
	public static void printNegative(int start,int end,int a[]) {
		if(end > a.length) {
			return;
		}
		for(int j=start;j<end;j++) {
			if(a[j] < 0) {
				System.out.print(a[j]+" ");
				return;
			}
		}
		System.out.print(0+" ");
	}
}
