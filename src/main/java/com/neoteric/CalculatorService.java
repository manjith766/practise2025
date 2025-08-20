package com.neoteric;

public class CalculatorService {
    public static void main(String[] args) {
        AddService addService = new AddService();
        System.out.println(addService.add(2,3));
        MultiplyService multiplyService = new MultiplyService();
        System.out.println(multiplyService.multi(2,3));
    }
}
