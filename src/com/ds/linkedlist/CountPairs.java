/*
 * Given two linked list of size N1 and N2 respectively of distinct elements, your task is to complete the function countPairs(), which returns the count of all pairs from both lists whose sum is equal to the given value X.

Input:
The function takes three arguments as input, reference pointer to the head of the two linked list (head1 and head2), and an variable X.
There will be T test cases and for each test case the function will be called separately.

Output:
For each test case the function should return the count of all the pairs from both lists whose sum is equal to the given value X. 

Constraints:
1<=T<=100
1<=N1,N2<=1000
1<=X<=10000

Example:
Input:
2
6
1 2 3 4 5 6
3
11 12 13
15
4
7 5 1 3
4
3 5 2 8
10

Output:
3
2*/
package com.ds.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

class Node {
	int data;
	Node next;

	Node(int key) {
		data = key;
		next = null;
	}
}

public class CountPairs {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test_cases = scn.nextInt();
		for (int t = 0; t < test_cases; t++) {
			int n1 = scn.nextInt();
			Integer arr[] = new Integer[n1];
			for(int i=0;i<n1;i++) {
				arr[i] = scn.nextInt();
			}
			int n2 = scn.nextInt();
			Integer arr2[] = new Integer[n2];
			for(int i=0;i<n2;i++) {
				arr2[i] = scn.nextInt();
			}
			int targetSum = scn.nextInt();
			LinkedList<Integer> head1 = new LinkedList<>(Arrays.asList(arr));
			LinkedList<Integer> head2 = new LinkedList<>(Arrays.asList(arr2));
			System.out.println(countPairs(head1, head2, targetSum));
		}
	}
	//using link list .29 seconds
	public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x)
    {
        // add your code here
		int count=0;
		if(head1.size() > head2.size()) {
			for(int i=0;i<head2.size();i++) {
				if(head1.contains(x-head2.get(i))) {
					count++;
				}
			}
		}else {
			for(int i=0;i<head1.size();i++) {
				if(head2.contains(x-head1.get(i))) {
					count++;
				}
			}
		}		
		return count;        
    }
	//using dummy array ... .29 seconds
	/*public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x)
    {
		int count=0;
		int [] data = new int[10100];
		for(int i=0;i<head1.size();i++) {
			data[head1.get(i)]++;
		}
		for(int i=0;i<head2.size();i++) {
			if(x-head2.get(i) >=0 && data[x-head2.get(i)] > 0) {
				count++;
			}
		}
		return count;			  
    }*/
}
