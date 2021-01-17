package com.jinhee.baekjoon.step02;

import java.util.Scanner;

public class practice1330 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(-10000 <= a && a <= 10000 && -10000 <= b && b <= 10000) {
			if(a > b) {
				System.out.println(">");
			} else if(a < b) {
				System.out.println("<");
			} else {
				System.out.println("==");
			}
		}
	}
}
