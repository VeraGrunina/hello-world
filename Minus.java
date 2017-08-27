package com.epam.homework2;

/**
 * Created by Вера on 27.08.2017.
 */
public class Minus {
    private double firstChislo;
    private double secondChislo;

    public Minus(double firstChislo, double secondChislo) {
        this.firstChislo = firstChislo;
        this.secondChislo = secondChislo;
    }

    public double minusResult() {
        return firstChislo-secondChislo;
    }
}
