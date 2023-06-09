package com.MyProject;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		
		// Mini Project
		
		Scanner sc = new Scanner(System.in);
		
		int myNumber=(int)(Math.random()*100);
		int userNumber=0;
		
		do {
			System.out.println("Guess My Number(1-100): ");
		    userNumber=sc.nextInt();
			
			if(userNumber==myNumber) {
				System.out.println("WOOHOO ... CORRECT NUMBER!!");
				break;
			}
			else if(userNumber>myNumber) {
				System.out.println("Your Number is too Large.");
			}
			else {
				System.out.println("Your Number is too Small.");
			}
		}while(userNumber>=0);
		
		System.out.println("My Number was "+myNumber);

	}

}
