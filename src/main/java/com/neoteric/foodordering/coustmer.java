package com.neoteric.foodordering;

import com.neoteric.loan.Payment;

import java.util.List;

public class coustmer {

    private String name;

    public coustmer(String name) {
        this.name = name;
    }

    public void placeOrder(Resturant resturant, List<Orderitem>orderitems,PaymentMethod payment){

        Order order = new Order();

        for (Orderitem item : orderitems){
            if(!resturant.getMenu().contains(item.getMenuitem())){
            throw new MenuItemNotFoundException(item.getItemName());
            }
            if (item.getQuantity()<=0) {
                throw new InvalidOrderException("quantity must be>0" + item.getItemName());
            }order.additem(item);

        }


        if (order.isEmpty()){
            throw new InvalidOrderException("order cannot be empty");

        }

        System.out.println(name+"placed order  at"+resturant.getName());
        order.ShowOrderSummary();

        payment.pay(order.getTotalAmount());
        System.out.println("order confirmed sucessfully");
    }
}
