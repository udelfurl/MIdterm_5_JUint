package main;

import static org.junit.Assert.*;

import org.junit.Test;

import creditcardeval.CredCardCheckDigit;

public class CreditCardCheckDigitTest {

	

	@Test
	public void checkcardnumber() {
	int[]creditcard=79927398713;
	int[]b;
	int[]a;
	b=(sum%10==0);
	a=(sum%10!=0);
	
	assertTrue(creditcard==b); 
	
	assertTrue(creditcard==a);
	
	}
	}
		
