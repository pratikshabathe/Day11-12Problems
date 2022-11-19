package com.blz.day11_12;

import java.util.ArrayList;
import java.util.Scanner;

class Stock{
	int buy;
	int sell;
}
public class StockAccount {
	
	void stockBuySell(int p[], int size) {
		if(size == 1) {
			System.out.println("No profit is possible as the number of days is equal to 1");
			return;
		}
		
		int c = 0;
		ArrayList<Stock>al = new ArrayList<Stock>();
		int j = 0;
		
		while(j < size -1) {
			while ((j < size -1) && (p[j + 1] <= p[j])) {
				j = j+1;
			}
			
			if(j == size -1) {
				break;
			}
			Stock st = new Stock();	
			st.buy = j+1;
			j = j+1;
			
			while ((j < size) && (p[j] >= p[j - 1]))  
			{  
			j = j + 1;  
			}  
			   
			st.sell = j;  
			al.add(st);  
			  
			// Incrementing the number of buy or sell  
			c = c + 1;  
			}  
			  
			// displaying the solution  
			if (c == 0)  
			{  
			System.out.println("Buying the stock on any given day will not make the profit.");  
			}  
			else  
			{  
			int ans = 0;  
			for (int i = 0; i < c; i++)  
			{  
			System.out.println("Buy the stock on day: " + al.get(i).buy  
			+ "  "  
			+ "Sell the stock on day: " + al.get(i).sell);  
			  
			ans = ans + (p[(al.get(i).sell - 1)] - p[(al.get(i).buy - 1)]);  
			}  
			  
			  
			  
			System.out.println("Thus, the total profit is: " + ans);  
			  
			}  
			  
			  
			  
			return;  
			}  
	
	private static String CompanyName ;
	private static  String stockRating ;
	private static String price ;
	private static String numOfShares ;
	
	public static String getCompanyName() {
		return CompanyName;
	}
	public static String getStockRating() {
		return stockRating;
	}
	
	public static String getprice() {
		return price;
	}
	
	public static String getnumOfShares() {
		return numOfShares;
	}
	
	public StockAccount(String CompanyName, String stockRating, String price, String numOfShares ) {
		super();
		this.CompanyName = CompanyName;
		this.stockRating = stockRating;
		this.price =price ;
		this.numOfShares = numOfShares;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Company name :" + CompanyName);
		System.out.println("Stock Rating  :" +stockRating);
		System.out.println("Price is :" + price);
		System.out.println("Number of shares  :" + numOfShares);
		
		int price [] = { 50, 60, 70, 80, 130};
		int size = price.length;                 //computing the size
		System.out.println("the price of the stock on different days is: ");
		
		for(int i = 0; i <size; i++) {
			System.out.println(price[i] + " ");
		}
		System.out.println();
		StockAccount obj = new StockAccount(CompanyName, CompanyName, CompanyName, CompanyName);
		int p[] = {50, 90, 130, 155, 20, 267, 347};  
		int size1 = p.length; // computing the size  
		  
		System.out.println("The price of the stock on different days is: ");  
		  
		for(int i = 0; i < size1; i++)  
		{  
		// displaying the stock price  
		System.out.print(p[i] + " ");  
		}  
		  
		System.out.println("\n");  
		  
		// method call  
		obj.stockBuySell(p, size1);  
		}  
		}  

