package edu.eci.arep.MathFactorService.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class FactorService {


    public String getFactors(String number){
        ArrayList<Integer> factors = new ArrayList<>();
        int limit = Integer.parseInt(number);
        for (int i = 1; i <limit; i++) {
            if (limit % i == 0) {
                factors.add(i);
            }
        }
        return factors.toString();
    }
}
