package com.jinhee.baekjoon.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		
		for(int i = 0; i < str.length; i++) {
			StringBuilder sb = new StringBuilder(str[i]);
			str[i] = sb.reverse().toString();
		}
		
		if(Integer.parseInt(str[0]) > Integer.parseInt(str[1])) {
			System.out.println(str[0]);
		} else {
			System.out.println(str[1]);
		}

	}
}
