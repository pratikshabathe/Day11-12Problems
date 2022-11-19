package com.blz.day11_12;

import java.util.Scanner;

public class StockAccount {

	private static String CompanyName;
	private static  String stockRating;
	private static int price;
	private static int numOfShares;
	
	public static String getCompanyName() {
		return CompanyName;
	}
	public static String getStockRating() {
		return stockRating;
	}
	
	public static int getprice() {
		return price;
	}
	
	public static int getnumOfShares() {
		return numOfShares;
	}
	
	public StockAccount(String CompanyName, String stockRating, int price, int numOfShares ) {
		super();
		this.CompanyName = " ";
		this.stockRating = " ";
		this.price = 20;
		this.numOfShares = 50;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Company name :" +getCompanyName());
		System.out.println("Stock Rating  :" +getStockRating());
		System.out.println("Price is :" + getprice());
		System.out.println("Number of shares  :" +getnumOfShares());
	}
}
