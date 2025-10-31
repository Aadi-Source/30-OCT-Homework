package Homework30;

public class program8 {
public static void main(String[] args) {
	int b=33,sum=0;
	
	while(b<=55) {
		if(b%2==0) {
			sum=sum+(b*b*b);
		}
		b++;
	}
	System.out.println(sum);
}
}
