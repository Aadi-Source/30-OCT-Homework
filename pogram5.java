package Homework30;

public class pogram5 {
	public static void main(String[] args) {
		int l=3;
		long product=1;
		
		while(l<=12) {
			if(l%2==0) {
				product=product*(l*l*l);
			}
			l++;
			
		}
		System.out.println(product);
	}

}
