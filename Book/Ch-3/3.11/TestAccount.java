class TestAccount{

	public static void main(String[] args){
		Account account1 = new Account("Ahmad", 20);
		account1.deposit(10);
		System.out.println(account1.getBalance());
		account1.setName("Ali");
		System.out.println(account1.getName());
		System.out.println(account1.withdraw(24.8));
	}
}