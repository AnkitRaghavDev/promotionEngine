package PromotionEngine;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		System.out.println("Total number of orders::");
		Scanner sc= new Scanner(System.in); 
		int a= sc.nextInt(); 
        for (int i = 0; i < a; i++)
        {                
        	System.out.println("Enter the type of product:A,B,C or D");
        	Scanner scanner = new Scanner(System. in);//System.in is a standard input stream.
        	System.out.print("Enter a string: ");
        	String type = scanner. nextLine(); //reads string.
        	products.add(new Product(type));
        }

        int totalPrice = getTotalPrice(products);
        System.out.println("TOTAL  PRICE:  " +totalPrice);
        sc.nextLine();
	}

	private static int getTotalPrice(List<Product> products)
    {
        int counterOfA = 0;
        int priceofA = 50;
        int counterOfB = 0;
        int priceofB = 30;
        int counterOfC = 0;
        int priceofC = 20;
        int counterOfD = 0;
        int priceofD = 15;
        for(Product pr: products)
        {
        	switch (pr.Id)
            {
                case "A":
                case "a":
                    counterOfA += 1;
                    break;
                case "B":
                case "b":
                    counterOfB += 1;
                    break;
                case "C":
                case "c":
                    counterOfC += 1;
                    break;
                case "D":
                case "d":
                    counterOfD += 1;
                    break;
            }		
        }
        int totalPriceOfA = (counterOfA / 3) * 130 + (counterOfA % 3 * priceofA);
        int totalPriceOfB = (counterOfB / 2) * 45 + (counterOfB % 2 * priceofB);
        int totalPriceOfC = (counterOfC * priceofC);
        int totalPriceOfD = (counterOfD * priceofD);
        return totalPriceOfA + totalPriceOfB + totalPriceOfC + totalPriceOfD;
    }
}
