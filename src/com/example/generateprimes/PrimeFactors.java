package com.example.generateprimes;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public void factor(double number) {

        int divisor = 2;

        while (divisor <= number) {
            while (number % divisor == 0) {
                itsFactors.add(divisor);
                number /= divisor;
            }
            divisor++;
        }
    }

    public List<Integer> itsFactors = new ArrayList<Integer>();
}
