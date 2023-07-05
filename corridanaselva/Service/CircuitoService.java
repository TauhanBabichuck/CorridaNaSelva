package com.example.corridanaselva.Service;

import com.example.corridanaselva.Entity.Circuito;
import com.example.corridanaselva.Repository.CircuitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CircuitoService {

    @Autowired
    private CircuitoRepository circuitoRepository;

    public Circuito salvarCircuito(Circuito circuito) {
        return circuitoRepository.save(circuito);
    }
    public List<Circuito> buscarCircuitos() {
        return circuitoRepository.findAll();
    }
    public Circuito buscarCircuitoId(Long id) {
        return circuitoRepository.findById(id).get();
    }

}
