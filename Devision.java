package com.epam.homework2;

/**
 * Created by Вера on 27.08.2017.
 */
public class Devision {
    private double firstChislo;
    private double secondChislo;

    public Devision(double firstChislo, double secondChislo) {
        this.firstChislo = firstChislo;
        this.secondChislo = secondChislo;
    }

    public double devisionResult() {
        return firstChislo/secondChislo;
    }
}
