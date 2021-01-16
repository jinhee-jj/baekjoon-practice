package com.jinhee.baekjoon.step01;

import java.util.Scanner;

public class practice10998 {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		int A;
		int B;
		
		do {
			A = scanner.nextInt();
			B = scanner.nextInt();
		
		}while(A<=0 || B>=10);
		
		System.out.println(A*B);
	}
}
