package try_num_2;

import java.util.Scanner;

public class Loan_calc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double loan_amt;
		double int_rate_per;
		double int_rate;
		int years;
		int mon_num;
		double mon_payment;
		double total;
		
		System.out.println("Enter your loan amount:");
		loan_amt = input.nextDouble();
		
		System.out.println("Enter your interest rate percent:");
		int_rate_per = input.nextDouble();
		
		System.out.println("Enter the number of years:");
		years = input.nextInt();
		
		int_rate = int_rate_per/100;
		mon_num = years*12;
		
		total = loan_amt * int_rate * years;
		mon_payment = total/mon_num;
		
		double other_mon_pay = loan_amt * int_rate / (1-1 / Math.pow(1 + int_rate, years * 12));
		
		System.out.println("");
		System.out.println("Your monthly payment is: " + mon_payment);
		System.out.println("Your total payment is: " + total);
		System.out.println("");
		System.out.println("The monthly payment according to pow is: "+ other_mon_pay);
		
		
		

	}

}
