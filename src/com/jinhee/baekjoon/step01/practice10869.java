package com.jinhee.baekjoon.step01;

import java.util.Scanner;

public class practice10869 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		if( A > 0 && B > 0 && A <= 10000 && B <= 10000) {
			
			System.out.println(A+B);
			System.out.println(A-B);
			System.out.println(A*B);
			System.out.println(A/B);
			System.out.println(A%B);
		}
	}
}
