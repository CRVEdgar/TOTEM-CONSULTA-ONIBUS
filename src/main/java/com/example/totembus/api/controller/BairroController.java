package com.example.totembus.api.controller;

import com.example.totembus.model.entity.Bairro;
import com.example.totembus.model.service.BairroService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bairro")
public class BairroController {

    private final BairroService service;

    public BairroController(BairroService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public Bairro save(Bairro bairro){
        return service.salvar(bairro);
    }
}
