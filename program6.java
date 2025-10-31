package Homework30;

public class program6 {
public static void main(String[] args) {
	int m=33,sum=0;
	
	do {
		if(m%2==0) {
			sum=sum+(m*m);
		}
		m++;
	}while(m<=55);
	System.out.println(sum);
}
}
