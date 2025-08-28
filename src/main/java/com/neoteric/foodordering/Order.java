package com.neoteric.foodordering;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<Orderitem> orderitemList = new ArrayList<>();



    public  void additem(Orderitem orderitem) {
        orderitemList.add(orderitem);
    }
    public double getTotalAmount() {
        return orderitemList.stream().mapToDouble(Orderitem::getCost).sum();

    }


    public void ShowOrderSummary(){
        System.out.println("----- Order Summary -----");

        for(Orderitem orderitem : orderitemList) {
            System.out.println(orderitem.getItemName() + " " + orderitem.getCost());
        }
        System.out.println("total amount"+getTotalAmount());
        }
    public boolean isEmpty() {
        return orderitemList.isEmpty();
    }


    }

