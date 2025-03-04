package utils;

public class PinValidator {
	public class Rules {
		public boolean isValid(String pin){
			if (pin.length() == 4 && pin.matches("\\d+")) {
				return true;
			}
			else {
				System.out.printf("Pin is Not Valid");
				return false;
			}
		}
	}
}