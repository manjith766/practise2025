package com.neoteric.countmachile;

public class CountmachineService {
    public int count(int numberofNotes,int denomination) {
        int count = 0;
        for (int i = 0; i < numberofNotes; i++) {
            count=count+denomination;

        }
        return count;
    }


}
