package edu.eci.arep.MathFactorService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arep.MathFactorService.Service.FactorService;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/mathService")
public class FactorController {

    @Autowired
    private FactorService factorService;
    @PostMapping("/factors")
    public ResponseEntity<?> getFactors(@RequestParam String number) {
        String factors = factorService.getFactors(number);
        Map<String, Object> response = new HashMap<>();
        response.put("operation", "primes");
        response.put("input", Integer.parseInt(number));
        response.put("output", factors);
        return ResponseEntity.ok(response);
    }

}
