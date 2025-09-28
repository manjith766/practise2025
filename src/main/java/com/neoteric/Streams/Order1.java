package com.neoteric.Streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Order1 {
    public static void main(String[] args) {
        Predicate<String>stringPredicate = s->"delivereds".equals(s);

        List<Order>orderList = new ArrayList<>();
        orderList.add(new Order("1","started"));
        orderList.add(new Order("2","delivered"));
        orderList.add(new Order("3","started"));
        orderList.add(new Order("4","started"));

        List<Order>orders = new ArrayList<>();

        Iterator<Order>iterator= orderList.iterator();
        while (iterator.hasNext()){
            Order order = iterator.next();
            if (!stringPredicate.test(order.getStatus())){
                orders.add(order);

            }
            System.out.println("undelivered orders(iterator)");
            for (Order o:orders){
                System.out.println(o.getId()+" "+o.getStatus());
            }
        }


        List<Order>undeliveredorders = orderList.stream()
                .filter(o->stringPredicate.negate().test(o.getStatus()))
                .collect(Collectors.toList());

        System.out.println("undelivered list");
        undeliveredorders.forEach(o-> System.out.println(o.getId()+" "+o.getStatus())
        );

    }
}
