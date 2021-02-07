package com.jinhee.baekjoon.step07;

import java.util.Scanner;

public class Practice11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String str = sc.next();
		
		int[] iarr = new int[num];
		
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			sum += (iarr[i] = Integer.parseInt(str.charAt(i) + ""));
			
		}
		System.out.println(sum);
	}
}
