package com.indusface.app;


public class RoundOfUtil {

    public double round(double num, int multipleOf) {
        return Math.ceil(num/multipleOf) * multipleOf;
    }
}
