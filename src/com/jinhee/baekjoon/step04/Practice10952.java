package com.jinhee.baekjoon.step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//입력
//입력은 여러 개의 테스트 케이스로 이루어져 있다.
//
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//입력의 마지막에는 0 두 개가 들어온다.
//
//출력
//각 테스트 케이스마다 A+B를 출력한다.

public class Practice10952 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
		
			String[] testCase = br.readLine().split(" ");
			
			int firstNum = Integer.parseInt(testCase[0]);
			int secondNum = Integer.parseInt(testCase[1]);
			
			
			if(firstNum == 0 && secondNum ==0) {
				break;
			}
			bw.write(firstNum + secondNum + "\n");
			
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}
