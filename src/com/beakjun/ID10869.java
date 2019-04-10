package com.beakjun;

import java.util.Scanner;

public class ID10869 {
	public void run() {
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 
		 if(a>=1&&b<10000) {
			 System.out.println(a+b);
			 System.out.println(a-b);
			 System.out.println(a*b);
			 System.out.println(a/b);
			 System.out.println(a%b);
			 
		 }
	}
}
