package com.jinhee.baekjoon.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Practice02 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		String str = br.readLine().toUpperCase();

		//65~90
		int[] iarr = new int[91];
		int charToInt; 
		
		for(int i = 0; i < str.length(); i++) {
			charToInt = str.charAt(i);
			iarr[charToInt]++;
		}
		
		for(int i = 65; i < iarr.length; i++) {
			
			if(iarr[i] != 0) {
				
				bw.write((char)i + ":" + iarr[i]+"\n");
			}
		}
		 
		bw.close();
		br.close();
	}
	
}
