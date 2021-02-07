package com.jinhee.baekjoon.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Practice01 {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		
		int[] iarr = new int[str.split(",").length];
		for(int i = 0; i < iarr.length; i++) {
			iarr[i] = Integer.parseInt(str.split(",")[i]);
		}
		
		for(int j = 0; j < iarr.length; j++) {
			
			if(j != 0) {
				
				if(iarr[j] == iarr[j-1]) {
					continue;
					
				} else {
					bw.write("," + iarr[j]);
				}
				
			} else {
				bw.write("[" + iarr[j]);
			}
		}
		
		bw.write("]");
		
		bw.close();
		br.close();
	}
	
	
}