package com.ds.linkedlist;

/*
 * Given a linked list of strings having n nodes check to see whether the combined string formed is palindrome or not. 

Input:
You have to complete the method which takes one argument: the head of the linked list . You should not read any input from stdin/console.. There are multiple test cases. For each test case, this method will be called individually.

Output:
Your function should return True if the combined string is pallindrome else it should return False.

User Task:
The task is to complete the function compute() which returns true or false.

Constraints:
1 <=T<= 103
1 <=n<= 103

Example:
Input :
2
5
a bc d dcb a
4
a bc d ba

Output :
True
False*/

public class LinkListPalindrom {
	public static void main(String[] args) {

	}

	public static boolean compute(Node node) {
		String str = "";
		Node temp = node;
		while (temp != null) {
			str += temp.data;
			temp = temp.next;
		}

		return isPalin(str);
	}

	public static boolean isPalin(String str) {
		int len = str.length();
		for (int i = 0; i < len; i++)
			if (str.charAt(i) != str.charAt(len - 1 - i)) {
				return false;
			}
		return true;
	}

}
