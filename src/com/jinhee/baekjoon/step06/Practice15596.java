package com.jinhee.baekjoon.step06;

public class Practice15596 {
	public long sum(int[] a) {
		
		long sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
	//	int[] a = {1, 2, 3, 4, 5, 6};
		Practice15596 practice = new Practice15596();
		
	//	System.out.println(practice.sum(a));
	}
}
