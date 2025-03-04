package main;

import banking.*;
import utils.*;
import java.io.Console;

public class BankApplication{
	public static void main(String arg[]){
		
		Console console = System.console();
		
		String accountNumber = console.readLine("Enter AccountNumber: ");
            	char[] userPin = console.readPassword("Enter Pin: ");
		// Converting Array to String.
		String pin = new String(userPin);
		
		PinValidator validator = new PinValidator();
            	PinValidator.Rules rules = validator.new Rules();

		if ( rules.isValid(pin) ) {
			if ( BankingSystem.LoginProcessor.Authenticate(accountNumber, pin ) ) {
				System.out.println("Access Granted");
			}
			else {
				System.out.println("Access Denied");
			} 
		}
	}
}