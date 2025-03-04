package banking;

import utils.PinValidator;

public class BankingSystem {
	static final String storedAccountNumber = "1234";
	static final String storedPin = "1234";
	
	public static class LoginProcessor {
		
		public static boolean Authenticate(String accountNumber, String pin) {
			
			PinValidator validator = new PinValidator();
            		PinValidator.Rules rules = validator.new Rules();

			if ( rules.isValid(pin) ) {
				return accountNumber.equals(storedAccountNumber) && pin.equals(storedPin);
			}
			else {
				return false;
			}
		}
	}	
}