package com.jinhee.baekjoon.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder(br.readLine().toUpperCase());
		
		
		
//		String str = br.readLine().toUpperCase();
//		String[] starr = new String[str.length()];
//		
//		for(int i = 0; i < str.length(); i++) {
//			if(i == 0) {
//				starr[i] = str.charAt(i) + "1";
//				
//			} else {
//				for(int j = 0; j < i; j++) {
//					if(str.charAt(i) == starr[j].charAt(0)) {	
//						starr[j] = str.charAt(i) + (Integer.parseInt(Character.toString(starr[j].charAt(1))) + 1 + "");
//						break;
//					} 
//					
//					if(j == i-1) {
//						starr[i] = str.charAt(i) + "1";
//					}
//				}
//			}
//			
//		}
//
//		
//		for(int i = 0; i < starr.length; i++) {
//			System.out.println(starr[i]);
//		}
	}
}
