package edu.eci.arep.ProxyService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ProxyController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/primes")
    public ResponseEntity<?> getPrimes(@RequestParam String number) {
        String url = "http://54.89.221.58:8080/apiv2/primes?number=" + number;
        ResponseEntity<?> response = restTemplate.postForEntity(url, null, Object.class);
        return ResponseEntity.ok(response.getBody());
    }

    @GetMapping("/factors")
    public ResponseEntity<?> getFactors(@RequestParam String number) {
        String url = "http://44.212.42.24:8080/mathService/factors?number=" + number;
        ResponseEntity<?> response = restTemplate.postForEntity(url, null, Object.class);
        return ResponseEntity.ok(response.getBody());
    }
}
