package com.neoteric.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Cart {
   private List<Product>productList = new ArrayList<>();

   public void addProduct(Product Product){
       productList.add(Product);
   }

    public List<Product> getProductList() {
         return productList;
    }


    public double getTotalPrice() {
        double total = 0;
        for (Product p : productList) {
            total += p.getPrice();
        }
        return total;
    }

}
