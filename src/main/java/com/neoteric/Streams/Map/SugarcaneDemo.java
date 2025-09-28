package com.neoteric.Streams.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SugarcaneDemo {
   static Function<Sugarcane,Juice>canetojuice = (cane)->{
        int quantity = cane.getLength()/2;
        Juice juice = new Juice(quantity);
        return juice;
    };

    public static void main(String[] args) {


        List<Sugarcane>sugarcaneList = new ArrayList<>();
        sugarcaneList.add(new Sugarcane(1));
        sugarcaneList.add(new Sugarcane(2));
        sugarcaneList.add(new Sugarcane(3));
        sugarcaneList.add(new Sugarcane(4));






    }
}
