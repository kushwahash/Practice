package com.ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * 
Given K sorted arrays arranged in form of a matrix. The task is to merge them. You need to complete mergeKArrays() function which takes 2 arguments, an arr[k][k] 2D Matrix containing k sorted arrays and an integer k denoting the number of sorted arrays. The function should return a pointer to the merged sorted arrays.

Input:
The first line of input contains the number of test cases, then T test cases follows. Each test case will contain an integer N denoting the number of sorted arrays. Then in the next line contains all the elements of the array separated by space.

Output:
The output will be the sorted merged array.

User Task:
The task is to complete the function mergeKArrays() which takes two arguments, and returns pointer to the modified array.

Constraints:
1 <= T <= 50
1 <= N <= 103
1 <= K <= 10

Example:
Input:
1
3
1 2 3 4 5 6 7 8 9 

Output:
1 2 3 4 5 6 7 8 9

Explanation:
Testcase 1:
Above test case has 3 sorted arrays of size 3, 3, 3
arr[][] = [[1, 2, 3],

             [4, 5, 6],

             [7, 8, 9]]
The merged list will be [1, 2, 3, 4, 5, 6, 7, 8, 9].*/

/*
public class MergeKArrays {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test_cases = scn.nextInt();
		for (int t = 0; t < test_cases; t++) {
			int n = scn.nextInt();
			int arr[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				for(int j=0;j<n;j++) {
					arr[i][j] = scn.nextInt();
				}
				
			}
			ArrayList<Integer> ans = mergeKArrays(arr,n);
			printArrays(ans,n*n);
		}
	}
	public static void printArrays(ArrayList<Integer> ans,int size) {
		for(int i=0;i<size;i++)
			System.out.print(ans.get(i)+" ");
		System.out.println();
	}
	public static ArrayList<Integer> mergeKArrays(int[][] arrays,int k) 
    {
     //add code here.
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0;i<k;i++) {
			for(int j=0;j<k;j++) {
				ans.add(arrays[i][j]);
			}
		}
		Collections.sort(ans);
		return ans;
    }
}*/

class HeapItem implements Comparable<HeapItem> {

	int[] array;
	int index;

	public HeapItem(int[] arr, int index) {
		this.array = arr;
		this.index = index;
	}

	public int compareTo(HeapItem o1) {
		return Integer.compare(array[index], o1.array[o1.index]);
	}
}

class GfG {
	public static ArrayList<Integer> mergeKArrays(int[][] arrays, int k) {
		PriorityQueue<HeapItem> pq = new PriorityQueue<>();
		for (int i = 0; i < arrays.length; i++)
			pq.offer(new HeapItem(arrays[i], 0));
		ArrayList<Integer> result = new ArrayList<Integer>();
		while (!pq.isEmpty()) {
			HeapItem current = pq.poll();
			result.add(current.array[current.index]);
			if (++current.index < current.array.length)
				pq.add(current);
		}
		return result;
	}
}
