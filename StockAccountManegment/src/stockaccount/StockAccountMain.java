package stockaccount;

import java.util.ArrayList;
import java.util.List;

class StockAccountMain {
	    private List<CompanyShares> companySharesList;

	    public StockAccountMain() {
	        companySharesList = new ArrayList<>();
	    }

	    public void buy(String stockSymbol, int numberOfShares, String dateTime) {
	        
	        CompanyShares existingCompanyShares = findCompanyShares(stockSymbol);

	        if (existingCompanyShares != null) {
	            existingCompanyShares = updateCompanyShares(existingCompanyShares, numberOfShares, dateTime);
	        } else {
	            CompanyShares newCompanyShares = new CompanyShares(stockSymbol, numberOfShares, dateTime);
	            companySharesList.add(newCompanyShares);
	        }

	        System.out.println("Buy transaction successful. Updated CompanyShares:");
	        displayCompanyShares();
	    }

	    public void sell(String stockSymbol, int numberOfShares, String dateTime) {
	        CompanyShares existingCompanyShares = findCompanyShares(stockSymbol);

	        if (existingCompanyShares != null) {
	            existingCompanyShares = updateCompanyShares(existingCompanyShares, -numberOfShares, dateTime);
	            System.out.println("Sell transaction successful. Updated CompanyShares:");
	        } else {
	            System.out.println("Sell transaction failed. CompanyShares not found for stock symbol: " + stockSymbol);
	        }

	        displayCompanyShares();
	    }

	    private CompanyShares findCompanyShares(String stockSymbol) {
	        for (CompanyShares companyShares : companySharesList) {
	            if (companyShares.getStockSymbol().equals(stockSymbol)) {
	                return companyShares;
	            }
	        }
	        return null;
	    }

	    private CompanyShares updateCompanyShares(CompanyShares companyShares, int numberOfShares, String dateTime) {
	        int updatedShares = companyShares.getNumberOfShares() + numberOfShares;
	        if (updatedShares >= 0) {
	            companyShares = new CompanyShares(companyShares.getStockSymbol(), updatedShares, dateTime);
	        } else {
	            System.out.println("Transaction failed. Insufficient shares to sell.");
	        }
	        return companyShares;
	    }

	    private void displayCompanyShares() {
	        System.out.println("Current CompanyShares:");
	        for (CompanyShares companyShares : companySharesList) {
	            System.out.println(companyShares);
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        StockAccountMain stockAccount = new StockAccountMain();
	        stockAccount.buy("AAPL", 10, "2023-01-01 10:30:00");
	        stockAccount.buy("GOOGL", 15, "2023-01-02 12:45:00");
	        stockAccount.sell("AAPL", 5, "2023-01-03 14:00:00");
	    }
	}

