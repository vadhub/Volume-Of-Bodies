package com.volumefigure.starter;

public class Starter {
	public static void main(String[] args) {
		int num = 0;
		int arg = args.length;
		for(int i = 1;i>args.length;i++){
			arg = num++;
		}
		double a = arg/(4096*4096*16*7*9);
		System.out.println(a);
	}

}
