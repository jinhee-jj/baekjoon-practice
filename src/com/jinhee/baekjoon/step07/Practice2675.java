package com.jinhee.baekjoon.step07;

import java.util.Scanner;

public class Practice2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testNum = sc.nextInt();
		sc.nextLine();
		
		String[] starr = new String[testNum];
		
		for(int i = 0; i < testNum; i++) {
			starr[i] = sc.nextLine();
		}
		
		for(int i = 0; i < testNum; i++) {
			
			int num = Integer.parseInt(starr[i].charAt(0)+"");
			int wordLength = starr[i].length();
			
			for(int j = 2; j < wordLength; j++) {
				for(int k = 0; k < num; k++) {
					System.out.print(starr[i].charAt(j));
				}
			}
			System.out.println("");
		}
	}
}
