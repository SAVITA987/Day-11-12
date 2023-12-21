package stockmanegment;

import java.util.Scanner;

public class StockManegmentMain {
         public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of stocks: ");
	        int numStocks = scanner.nextInt();

	        StockPortfolio stockPortfolio = new StockPortfolio();

	        for (int i = 0; i < numStocks; i++) {
	            System.out.println("Enter details for Stock " + (i + 1) + ":");
	            System.out.print("Share Name: ");
	            String shareName = scanner.next();
	            System.out.print("Number of Shares: ");
	            int numberOfShares = scanner.nextInt();
	            System.out.print("Share Price: ");
	            double sharePrice = scanner.nextDouble();

	            Stock stock = new Stock(shareName, numberOfShares, sharePrice);
	            stockPortfolio.addStock(stock);
	        }

	        stockPortfolio.printStockReport();
	    }
	}
