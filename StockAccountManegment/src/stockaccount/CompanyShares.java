package stockaccount;

class CompanyShares {
	    private String stockSymbol;
	    private int numberOfShares;
	    private String dateTime;

	    public CompanyShares(String stockSymbol, int numberOfShares, String dateTime) {
	        this.stockSymbol = stockSymbol;
	        this.numberOfShares = numberOfShares;
	        this.dateTime = dateTime;
	    }

	    public String getStockSymbol() {
	        return stockSymbol;
	    }

	    public int getNumberOfShares() {
	        return numberOfShares;
	    }

	    public String getDateTime() {
	        return dateTime;
	    }

	    @Override
	    public String toString() {
	        return "Stock Symbol: " + stockSymbol + ", Number of Shares: " + numberOfShares + ", DateTime: " + dateTime;
	    }
	}
