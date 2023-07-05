package com.example.corridanaselva.Controller;

import com.example.corridanaselva.Entity.Maratonista;
import com.example.corridanaselva.Service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1")
public class MaratonistaController {

    @Autowired
    private MaratonistaService maratonistaService;

    @PostMapping("add")
    public ResponseEntity<Maratonista> salvarMaratonista(@RequestBody Maratonista maratonista){
        return ResponseEntity.status(HttpStatus.CREATED).body(maratonistaService.salvarMaratonista(maratonista));
    }
    @GetMapping("maratonistas")
    public List<Maratonista> buscarMaratonistas(){
        return maratonistaService.buscarMaratonistas();
    }
    @GetMapping("maratonista/{id}")
    public Maratonista buscarMaratonistaId(@PathVariable Long id){
        return maratonistaService.buscarMaratonistaId(id);
    }

}
