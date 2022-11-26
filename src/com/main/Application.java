package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("a");
			int a = in.nextInt();
			System.out.println("b");
			int b = in.nextInt();
			System.out.println("n");
			int n = in.nextInt();
			int k =0;
			for (int i = 1; i <=n; i++) {
				k=0;
				for (int j = 0; j < i; j++) {
					int c = (int) Math.pow(2, j);
					k = k+(c*b);
				}
				System.out.println("s:"+i+" "+(a+k));
				
			}
		}
	}

}
