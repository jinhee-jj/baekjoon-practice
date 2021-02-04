package com.jinhee.baekjoon.step05;

import java.util.Scanner;

public class Practice2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[9];
		
		numArr[0] = sc.nextInt();
		numArr[1] = sc.nextInt();
		numArr[2] = sc.nextInt();
		numArr[3] = sc.nextInt();
		numArr[4] = sc.nextInt();
		numArr[5] = sc.nextInt();
		numArr[6] = sc.nextInt();
		numArr[7] = sc.nextInt();
		numArr[8] = sc.nextInt();

		int max = 0;
		int idx = 0;
		for(int i = 0; i < numArr.length; i++) {
			
			if(numArr[i] > max) {
				max = numArr[i];
				idx = i+1;
			}
		}
		System.out.println(max + "\n" + idx);
	}
}
