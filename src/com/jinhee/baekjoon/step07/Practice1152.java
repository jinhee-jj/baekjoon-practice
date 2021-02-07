package com.jinhee.baekjoon.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		if(str.length != 0) {
			if(str[0].equals("")) {
				System.out.println(str.length - 1);
			} else {
				System.out.println(str.length);
		
			}
		} else {
			System.out.println(0);
		}
	}
}
