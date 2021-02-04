package com.jinhee.baekjoon.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String[] numArr = br.readLine().split(" ");
		
		double[] numArr2 = new double[num];
		
		for(int i = 0; i < numArr2.length; i++) {
			numArr2[i] = Double.parseDouble(numArr[i]);
		}
		
		double max = numArr2[0];
		int maxIdx = 0;
		
		for(int i = 0; i < numArr2.length; i++) {
			for(int j = i+1; j < numArr2.length; j++) {

				if(numArr2[i] < numArr2[j]) {
					if(max < numArr2[j]) {
						
						max = numArr2[j];
						maxIdx = j;
					}
				}
			}
		}
		
		double sum = 0;
		for(int i = 0; i < numArr2.length; i++) {
			numArr2[i] = numArr2[i]/max * 100;
			sum += numArr2[i];
		}
	
		System.out.println((double)sum/num);
		
		
	}
}
