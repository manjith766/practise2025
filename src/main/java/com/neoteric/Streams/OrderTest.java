package com.neoteric.Streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class OrderTest {

    static Predicate<String> statusPredicte = s -> "delivered".equals(s);

    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();
        orders.add(new Order("1", "started"));
        orders.add(new Order("2", "delivered"));
        orders.add(new Order("3", "started"));
        orders.add(new Order("4", "started"));


        Iterator<Order> iterator = orders.iterator();
        int deliveredcount = 0;

        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (statusPredicte.test(order.getStatus())) {
                deliveredcount = deliveredcount + 1;
            }
        }
        System.out.println("deliveredcount" + deliveredcount);


        long deliveredcountstream = orders.stream()
                .filter(o -> statusPredicte.test(o.getStatus()))
                .count();
        System.out.println("deliveredcountstream" + deliveredcountstream);



    }
}
