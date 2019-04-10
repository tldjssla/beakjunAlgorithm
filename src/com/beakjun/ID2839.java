package com.beakjun;

import java.util.Scanner;

public class ID2839 {
	public void run() {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		if(a>=3&&a<=5000) {
			boolean result=false;
			int count = 0;			
			int res5 =0;
			int res3 =0;			
			count=count+(a/5);				
			for (int i = count; i>=0; i--) {
				int b = a-(5*i);
				if(b%3==0&&!result) {
					result =true;
					res5=i;
					res3=b/3;
				}
			}
			if(result) { 
				System.out.println(res5+res3);
			}else {
				System.out.println("-1");
			}

		}
	}
}
