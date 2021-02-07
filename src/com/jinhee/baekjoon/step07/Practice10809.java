package com.jinhee.baekjoon.step07;

import java.util.Scanner;

public class Practice10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		for(int i = 97; i <= 122; i++) {
			System.out.print(word.indexOf(i)+ " ");
		}
	}
}
