package com.neoteric.foodordering;

import java.util.List;

public interface ReasturantRepository {
    void addRestaurant(Resturant restaurant);
    void removeRestaurant(String name);
    Resturant findByName(String name);
    List<Resturant> getAllRestaurants();
}
