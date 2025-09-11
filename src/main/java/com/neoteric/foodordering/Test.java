package com.neoteric.foodordering;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        ReasturantRepository repo = new InMemoryRestaurantRepository();

        Resturant birayanihouse = new Resturant("biryanihouse");
        birayanihouse.addMenuItem(new Menu("chickenbiryani",200));
        birayanihouse.addMenuItem(new Menu("vegbiryani",200));


        Resturant vantasala = new Resturant("vantasala");
        vantasala.addMenuItem(new Menu("muttonbiryani",200));
        vantasala.addMenuItem(new Menu("vegbiryani",200));

        repo.addRestaurant(birayanihouse);
        repo.addRestaurant(vantasala);

        try {
            Resturant search = repo.findByName("biryanihouse");
            search.showMenu();


            coustmer rahul = new coustmer("rahul");
            List<Orderitem>orderitems = Arrays.asList(
                    new Orderitem(birayanihouse.getMenu().get(0),1),
                    new Orderitem(birayanihouse.getMenu().get(1),1)
            );
            rahul.placeOrder(birayanihouse,orderitems,new UpiPayment());

        }catch (RestaurantNotFoundException | InvalidOrderException|MenuItemNotFoundException|PaymentFailedException e){
            System.out.println(" "+e.getMessage());
        }


    }
}
