package com.example.totembus.model.repository;


import com.example.totembus.model.entity.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BairroRepository extends JpaRepository<Bairro, Long> {

}
