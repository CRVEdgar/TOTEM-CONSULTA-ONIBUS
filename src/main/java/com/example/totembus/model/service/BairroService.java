package com.example.totembus.model.service;


import com.example.totembus.model.entity.Bairro;
import com.example.totembus.model.repository.BairroRepository;
import org.springframework.stereotype.Service;

@Service
public class BairroService {

    private final BairroRepository repository;

    public BairroService(BairroRepository repository) {
        this.repository = repository;
    }

    public Bairro salvar(Bairro bairro){
        return repository.save(bairro);
    }


}
