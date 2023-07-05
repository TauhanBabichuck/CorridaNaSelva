package com.example.corridanaselva.Controller;

import com.example.corridanaselva.Entity.Circuito;
import com.example.corridanaselva.Service.CircuitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v3")
public class CircuitoController {

    @Autowired
    private CircuitoService circuitoService;

    @PostMapping("add")
    public ResponseEntity<Circuito> salvarCircuito(@RequestBody Circuito circuito){
        return ResponseEntity.status(HttpStatus.CREATED).body(circuitoService.salvarCircuito(circuito));
    }
    @GetMapping("circuitos")
    public List<Circuito> buscarCircuitos(){
        return circuitoService.buscarCircuitos();
    }
    @GetMapping("circuito/{id}")
    public Circuito buscarCircuitoId(@PathVariable Long id){
        return circuitoService.buscarCircuitoId(id);
    }

}
