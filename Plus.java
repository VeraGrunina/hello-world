package com.epam.homework2;

/**
 * Created by Вера on 27.08.2017.
 */
public class Plus {
    private double firstChislo;
    private double secondChislo;

    public Plus(double firstChislo, double secondChislo) {
        this.firstChislo = firstChislo;
        this.secondChislo = secondChislo;
    }

    public double plusResult() {
        return firstChislo+secondChislo;
    }
}
