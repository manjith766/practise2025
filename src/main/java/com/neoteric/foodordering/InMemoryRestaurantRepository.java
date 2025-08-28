package com.neoteric.foodordering;

import java.util.*;

public class InMemoryRestaurantRepository implements ReasturantRepository{

    private final Map<String, Resturant> restaurantMap = new HashMap<>();

    @Override
    public void addRestaurant(Resturant restaurant) {
        restaurantMap.put(restaurant.getName().toLowerCase(),restaurant);

    }

    @Override
    public void removeRestaurant(String name) {
        if(!restaurantMap.containsKey(name.toLowerCase())){
            throw new RestaurantNotFoundException(name);
        }
        restaurantMap.remove(name.toLowerCase());
        System.out.println("removed resturant:"+name);

    }

    @Override
    public Resturant findByName(String name) {
        Resturant resturant = restaurantMap.get(name.toLowerCase());
        if (resturant == null) {
            throw new RestaurantNotFoundException(name);
        }
        return resturant;
    }

    @Override
    public List<Resturant> getAllRestaurants() {
        return new ArrayList<>(restaurantMap.values());
    }
}
