package com.beakjun;
import java.util.Scanner;

public class ID11719 {
	public void run() {		 
		 Scanner sc = new Scanner(System.in);
		 while(sc.hasNext()) {
			 String a = sc.nextLine();
			 boolean regCheck =true;
			 
			 if(a.length()<=100){
				 for (int i = 0; i < a.length(); i++){ 					 
					if(!regCheck(a.charAt(i))&&regCheck){
						regCheck = false;
					}
				}
			 }
			 
			 if(regCheck) {
				 System.out.println(a.trim()); 
			 }
		 }
	 }
	 
	 public static boolean regCheck(char a) {
		 boolean isNumberOrAlpabet = false;
		 if(a==32) {
			 isNumberOrAlpabet = true;
		 }
		 if(a>=48&&a<=57) {
			 isNumberOrAlpabet = true;
		 }
		 if(a>=65&&a<=90) {
			 isNumberOrAlpabet = true;
		 }
		 if(a>=97&&a<=12122) {
			 isNumberOrAlpabet = true;
		 }		 
		 return isNumberOrAlpabet;
	 }
}
