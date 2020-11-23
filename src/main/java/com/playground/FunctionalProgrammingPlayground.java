package com.playground;

import java.util.function.Function;

public class FunctionalProgrammingPlayground {


    public static void main(String[] args) {
        functionComposition();
    }

    private static void functionComposition() {

        Function<Double, Double> discountPremium = price -> price * 0.8;

        Function<Double, String> getPriceTag = price ->String.format("Discounted Price : %s ", price);

        Function<Double, String> getDiscountedPriceTag = discountPremium.andThen(getPriceTag);

        var discountedPrice = getDiscountedPriceTag.apply(100.0);//Discounted Price : 80.0
        System.out.println(discountedPrice);

    }
}
