package Homework30;

public class program2 {
public static void main(String[] args) {
	int c,i=3;
	long Product=1;
	
	while(i<=12) {
		if(i%2!=0) {
			c=i*i*i;
			Product=Product*c;
		}
		i++;
	}
	System.out.println(Product);
}
}
