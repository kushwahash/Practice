/*
 * Given an array with positive number the task to find the largest subsequence from array that contain elements which are Fibonacci numbers.

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains an integer N denoting the size of the array. Then in the next line are N space separated values of the array.

Output:
For each test case in a new line print the space separated elements of the  longest fibonacci subsequence.

Constraints:
1<=T<=100
1<=N<=100
1<=A[]<=1000

Example:
Input:
2
7
1 4 3 9 10 13 7
9
0 2 8 5 2 1 4 13 23

Output:
1 3 13
0 2 8 5 2 1 13 
 * 
 */
package com.ds.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestFibSeq {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test_cases = scn.nextInt();
		for (int t = 0; t < test_cases; t++) {
			int sizeOfArray = scn.nextInt();
			ArrayList<Integer> ans = new ArrayList<>();
			for(int i=0;i<sizeOfArray;i++) {
				int n = scn.nextInt();
				if(isPerfectSquar(5*(n*n)+4)|| isPerfectSquar(5*(n*n)-4)) {
					ans.add(n);
				}
			}			
			for(int i=0;i<ans.size();i++)
				System.out.print(ans.get(i)+" ");
			System.out.println();
		}
		scn.close();
	}
	public static boolean isPerfectSquar(int n) {
		int a = (int)Math.sqrt(n);
		return a*a == n;
	}
}
