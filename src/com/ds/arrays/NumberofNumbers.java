/*
 * 
Given an array A[]  of n elements. Your task is to complete the Function num which returns an integer denoting the total number of times digit k appears in the whole array.

For Example:

A[]={11,12,13,14,15}, k=1

Output=6 //Count of the digit 1 in the array


Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. The first line of each test case contain an integer n denoting the size of the array A[]. Then in the second line are n space separated values of the array A[] .In the third line of each test case contains an integer k, which is the digit to be counted.
 

Output:
For each test case in a new line print the number of elements counted.
 

Constraints:
1<=T<=100
1<=n<=20
1<=A[]<=1000
 

Example(To be used for expected output):
Input:
2
5
11 12 13 14 15 
1
4
0 10 20 30
0

Output:
6
4
 * */

package com.ds.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberofNumbers {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test_cases = scn.nextInt();
		for (int t = 0; t < test_cases; t++) {
			int sizeOfArray = scn.nextInt();
			int arr[] = new int[sizeOfArray];
			for(int i=0;i<sizeOfArray;i++) {
				arr[i] = scn.nextInt();
			}
			int target_digit = scn.nextInt();
			System.out.println(num(arr,sizeOfArray,target_digit));
		}
	}
	public static int num(int a[], int n, int k)
    {
         //Your code here
		int count = 0;
		for(int i=0;i<a.length;i++) {
			int num = a[i];
			while(num >= 10) {
				if(num%10 == k) {
					count++;
				}
				num = num/10;
			}
			if(num == k)
				count++;
		}
		return count;
    }
}
