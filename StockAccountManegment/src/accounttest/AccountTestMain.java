package accounttest;

public class AccountTestMain {
	
	    public static void main(String[] args) {
	       
	        Account myAccount = new Account(1000.0);

	        System.out.println("Initial balance: " + myAccount.getBalance());

	        myAccount.credit(500.0);
	        System.out.println("After crediting 500.0: " + myAccount.getBalance());

	        myAccount.debit(200.0);
	        System.out.println("After debiting 200.0: " + myAccount.getBalance());

	        myAccount.debit(1500.0);
	        System.out.println("After debiting 1500.0: " + myAccount.getBalance());
	    }
	}


