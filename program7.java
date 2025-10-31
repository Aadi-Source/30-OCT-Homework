package Homework30;

public class program7 {
public static void main(String[] args) {
	
	int sum=0;
	
	for(int a=33;a<=55;a++) {
		if(a%2!=0) {
			sum=sum+(a*a*a);
		}
	}
	System.out.println(sum);
}
}
