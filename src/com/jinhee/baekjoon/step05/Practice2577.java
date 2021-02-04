package com.jinhee.baekjoon.step05;

import java.util.Scanner;

public class Practice2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int multiple = num1 * num2 * num3;
		
		String multi = Integer.valueOf(multiple).toString();
		
		int[] cntArr = new int[10];
		
		for(int i = 0; i < multi.length(); i++) {
			
			for(int j = 0; j <= 9; j++) {
				//System.out.println(multi.charAt(i));
				if(multi.charAt(i) == Integer.valueOf(j).toString().charAt(0)) {
					//System.out.println(j);
					cntArr[j]++;
				}
			}
		}
		
		for(int i = 0; i < cntArr.length; i++) {
			System.out.println(cntArr[i]);
		}
	}
}
