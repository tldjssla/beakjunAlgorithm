package com.beakjun;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ID1008 {
	public void run() {
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 
		 double mul = (double)a/b;
		 if(a>0&&b<10) {
			 DecimalFormat df=new DecimalFormat("#.#########");
			 System.out.println(df.format(mul));	 
		 }
		
	}
}
