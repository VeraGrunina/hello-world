package com.epam.homework2;

/**
 * Created by Вера on 27.08.2017.
 */
public class Multiply {
    private double firstChislo;
    private double secondChislo;

    public Multiply(double firstChislo, double secondChislo) {
        this.firstChislo = firstChislo;
        this.secondChislo = secondChislo;
    }

    public double multiplyResult() {
        return firstChislo*secondChislo;
    }
}
