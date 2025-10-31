package Homework30;

public class program3 {
	public static void main(String[] args) {
		int sq,j=3;
		long product=1;
		
		do {
			if(j%2!=0) {
				sq=j*j;
				product=product*sq;
			}
			j++;
		}while(j<=12);
		System.out.println(product);
	}

}
