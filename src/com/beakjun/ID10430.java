package com.beakjun;

import java.util.Scanner;

public class ID10430 {
	public void run() {
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();
		 if(2<=a&&c<=10000) {
			 System.out.println((a+b)%c);
			 System.out.println((a%c +b%c)%c);
			 System.out.println((a*b)%c);
			 System.out.println((a%c*b%c)%c);			 
		 }
	}
}
