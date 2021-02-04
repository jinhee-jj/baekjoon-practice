package com.jinhee.baekjoon.step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//문제
//대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
//
//입력
//첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//
//둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
//이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//
//출력
//각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
public class Practice4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCaseNum = Integer.parseInt(br.readLine());
		String[] caseArr = new String[testCaseNum];
		
		for(int i = 0; i < testCaseNum; i++	 ) {
			caseArr[i] = br.readLine();
			String[] oneCaseStr = caseArr[i].split(" ");
			int size = oneCaseStr.length;
			
			int[] oneCase = new int[size];
			
			int sum = 0;
			int avg = 0;
			for(int j = 0; j < size; j++) {
				oneCase[j] = Integer.parseInt(oneCaseStr[j]); 
			
				//System.out.println(oneCase[j]);
				
				if(j != 0) {
					sum += oneCase[j];
				}
			}
			avg = sum / (size - 1);
		//	System.out.println(avg);
			
			double highScoreNum = 0;
			for(int k = 1; k < size; k++) {
				if(oneCase[k] > avg) {
					highScoreNum++;
				}
			}
			//System.out.println(highScoreNum);
			//System.out.println(size - 1);
			
			double percent = (highScoreNum / (size-1)) * 100;
			bw.write(String.format("%.3f", percent) + "%\n");
		//	System.out.println(String.format("%.3f", percent) + "%") ;
			
			
		}
		br.close();
		bw.close();
	}
}
