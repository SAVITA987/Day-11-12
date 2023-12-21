package accounttest;

class Account {
	    
	    private double balance;

	    // Constructor
	    public Account(double initialBalance) {
	        if (initialBalance >= 0) {
	            balance = initialBalance;
	        } else {
	            balance = 0.0;
	            System.out.println("Initial balance cannot be negative. Setting balance to 0.0");
	        }
	    }
	    public void credit(double amount) {
	        balance += amount;
	    }
	    
	    public void debit(double amount) {
	        if (amount > balance) {
	            System.out.println("Debit amount exceeded account balance. Balance remains unchanged.");
	        } else {
	            balance -= amount;
	            System.out.println("Debit successful. Remaining balance: " + balance);
	        }
	    }
	    public double getBalance() {
	        return balance;
	    }
	}

	