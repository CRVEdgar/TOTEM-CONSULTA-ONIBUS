package com.example.totembus.api.controller;

import com.example.totembus.model.entity.Bairro;
import com.example.totembus.model.service.BairroService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bairro")
public class BairroController {

    private final BairroService service;

    public BairroController(BairroService service) {
        this.service = service;
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Bairro save(@RequestBody Bairro bairro){
        System.out.println("BAIRRO: " + bairro);
        return service.salvar(bairro);
    }
}
