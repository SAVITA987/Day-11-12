package stockmanegment;

import java.util.ArrayList;

class Stock {
        
	String shareName;
	    int numberOfShares;
	    double sharePrice;

	    // Constructor
	    public Stock(String shareName, int numberOfShares, double sharePrice) {
	        this.shareName = shareName;
	        this.numberOfShares = numberOfShares;
	        this.sharePrice = sharePrice;
	    }
	    
	    public double calculateStockValue() {
	        return numberOfShares * sharePrice;
	    }
	}

	class StockPortfolio {
	    ArrayList<Stock> stocks;

	    // Constructor
	    public StockPortfolio() {
	        stocks = new ArrayList<>();
	    }

	    public void addStock(Stock stock) {
	        stocks.add(stock);
	    }

	    public double calculateTotalPortfolioValue() {
	        double totalValue = 0;
	        for (Stock stock : stocks) {
	            totalValue += stock.calculateStockValue();
	        }
	        return totalValue;
	    }
	    public void printStockReport() {
	        System.out.println("Stock Report:");
	        System.out.printf("%-15s%-20s%-15s%-15s\n", "Share Name", "Number of Shares", "Share Price", "Stock Value");
	        for (Stock stock : stocks) {
	            System.out.printf("%-15s%-20d%-15.2f%-15.2f\n",
	                    stock.shareName, stock.numberOfShares, stock.sharePrice, stock.calculateStockValue());
	        }
	        System.out.println("Total Portfolio Value: " + calculateTotalPortfolioValue());
	    }
	}

	

