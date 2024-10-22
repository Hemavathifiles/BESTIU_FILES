package org.tns.capgemini.c2tc.oops;

class PaymentMethod
{
	void makePayment()
	{
		System.out.println("Processing payment");
	}
}

class CreditCard extends PaymentMethod
{
	void swipecard()
	{
		System.out.println("Swiping credit card");
	}
}

class Paypal extends PaymentMethod
{
	void loginToPaypal()
	{
		System.out.println("Logging into paypal");
	}
}

public class InstanceOfDemo2 {

	public static void main(String[] args) {
		PaymentMethod payment = new PaymentMethod();

		payment=new Paypal();
		
		if(payment instanceof CreditCard)
		{
			CreditCard cc = (CreditCard) payment;
			cc.swipecard();
		}
		else if(payment instanceof  Paypal)
		{
			 Paypal  pp = (Paypal) payment;
			 pp.loginToPaypal();

		}

	}

}