package com.jinhee.baekjoon.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice10818 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String num = br.readLine();
		String[] numArr = num.split(" ");
		
		
		int[] numArr2 = new int[numArr.length];
		
		for(int i=0; i<n; i++) {
			numArr2[i] = Integer.parseInt(numArr[i]);
		}
		int min=numArr2[0], max=numArr2[0];

		for(int i=0; i<n; i++) {
			
			if(numArr2[i] > max) {
				max = numArr2[i];
			}
			if (numArr2[i] < min) {
				min = numArr2[i];
			}
		}
		
		System.out.println(min + " " + max);
	}
}
