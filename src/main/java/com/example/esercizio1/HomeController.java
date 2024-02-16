package com.example.esercizio1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HomeController {
    @GetMapping("/ciao")
    public String saluto(
            @RequestParam(required = true) String nome,
            @RequestParam(required = false) String provincia) {
        return "Ciao " + nome + ", com'è il tempo in " + provincia + " ?";
    }
}
