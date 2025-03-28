package edu.eci.arep.MathPrimeService.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;


@Service
public class PrimeService {
    public String getPrimes(String number) {
        ArrayList<Integer> primes = new ArrayList<>();
        int limit = Integer.parseInt(number);

        for (int i = 1; i < limit; i++) {
            int amount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    amount++;
                }
            }
            if (amount == 2){
                primes.add(i);
            }
        }
        return primes.toString();
    }
}