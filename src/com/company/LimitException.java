package com.company;

public class LimitException extends Exception{
    public LimitException(String message,double remaining) {
        super(message);

    }

    public static double getRemainingAmount() {

        return 0;
    }







    }
