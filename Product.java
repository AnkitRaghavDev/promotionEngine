package PromotionEngine;

public class Product {

	 public String Id ; 
	 public Double Price ;

     public Product(String id)
     {
         this.Id = id;
         switch (id)
         {
             case "A":
                 this.Price = (double) 50;
                 break;
             case "B":
                 this.Price = (double) 30;
                 break;
             case "C":
                 this.Price = (double) 20;
                 break;
             case "D":
                 this.Price = (double) 2015;
                 break;
         }
     }
}
