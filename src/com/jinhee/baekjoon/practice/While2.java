package com.jinhee.baekjoon.practice;

public class While2 {
	public static void main(String[] args) {
		
		double day = 3;
		double night = 2.5;
		
		double tree = 13;
		int cntDay = 0;
		
		double distance = 0;
		
		while(true) {
			
			cntDay++;
			
			distance += day;
			
			if(distance >= tree) {
				
				break;
			} else {
				distance -= night;
			}
		}
		System.out.println(cntDay);
		
	}
}
