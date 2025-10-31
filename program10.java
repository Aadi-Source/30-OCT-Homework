package Homework30;

import java.util.Scanner;

public class program10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Starting Digit :  ");
		int Start=sc.nextInt();
		
		System.out.println("Enter Ending Digit   :  ");
		int End=sc.nextInt();
		
		int Primecount=0;
		
		for(int i=Start;i<=End;i++) {
			int count=0;
			
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				Primecount++;
			}
			
		}
		System.out.println("Total Prime Numbers :  "+ Primecount);
		
	}

}
