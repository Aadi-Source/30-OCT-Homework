package Homework30;

public class Program1 {
	public static void main(String[] args) {
		int sum=0,sq;
		for(int i=33;i<=55;i++) {
			if(i%2!=0) {
				sq=i*i;
				sum=sum+sq;
			}
		}
		System.out.println(sum);
	}

}
