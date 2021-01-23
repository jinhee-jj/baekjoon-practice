package com.jinhee.baekjoon.step03;

import java.util.Scanner;

//문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//출력
//각 테스트 케이스마다 A+B를 출력한다.
public class Practice10950 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("테스트할 횟수 입력 : ");
		int caseNum = sc.nextInt();
		
		int i = 0;
		do {
//			System.out.print("첫번째 수 : ");
			int firstNum = sc.nextInt();
//			System.out.print("두번째 수 : ");
			int secondNum = sc.nextInt();
			
			
			System.out.println(firstNum + secondNum);
			i++;
		} while(i < caseNum);

	}
}
