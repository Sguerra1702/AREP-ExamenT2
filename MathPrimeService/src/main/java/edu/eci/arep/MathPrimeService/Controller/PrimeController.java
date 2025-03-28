package edu.eci.arep.MathPrimeService.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arep.MathPrimeService.Service.PrimeService;
@RestController
@RequestMapping("apiv2")
public class PrimeController {
    @Autowired
    private PrimeService primeService;
    @PostMapping("/primes")
    public ResponseEntity<?> getFactors(@RequestParam String number) {
        String factors = primeService.getPrimes(number);
        Map<String, Object> response = new HashMap<>();
        response.put("operation", "factors");
        response.put("input", Integer.parseInt(number));
        response.put("output", factors);
        return ResponseEntity.ok(response);
    }
}
