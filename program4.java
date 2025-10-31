package Homework30;

public class program4 {
public static void main(String[] args) {
	long product=1;
	for(int k=3;k<=12;k++) {
		if(k%2==0) {
			product=(k*k)*product;
		}
	}
	System.out.println(product);
}
}
