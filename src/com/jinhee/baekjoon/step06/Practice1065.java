package com.jinhee.baekjoon.step06;

import java.util.Scanner;


public class Practice1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Practice1065.hansu(n));
		
	}
	
	static int hansu(int n) {
		
		int hansuCnt = 0;
		
		for(int k = 1; k <= n; k++) {
			
			int chai = 0, firstChai = 0;
			int cnt = 0;	
			int a = 1;
			
			while((k / a) != 0) {
				
				a *= 10;
				cnt++;
			}
			
			int[] iarr = new int[cnt];
			
			for(int i = 0; i < cnt; i++) {
				iarr[i] = (k%a) / (a/10);
				a /= 10;
			}
		
			
			if(k > 99) {
				
				for(int j = 0; j < cnt-1; j++) {
					firstChai = iarr[1] - iarr[0];
					chai = iarr[j+1] - iarr[j];
					
					if(firstChai != chai) {
						break;
					}
					if(j+1 == cnt-1 ) {
						hansuCnt++;
					}
				}
			} else {
				hansuCnt++;
			}
		}
		
		return hansuCnt;
	}
}
