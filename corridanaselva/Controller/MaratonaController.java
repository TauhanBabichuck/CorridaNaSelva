package com.example.corridanaselva.Controller;

import com.example.corridanaselva.Entity.Maratona;
import com.example.corridanaselva.Service.MaratonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v4")
public class MaratonaController {

    @Autowired
    private MaratonaService maratonaService;

    @PostMapping("add")
    public ResponseEntity<Maratona> salvarMaratona(@RequestBody Maratona maratona){
        return ResponseEntity.status(HttpStatus.CREATED).body(maratonaService.salvarMaratona(maratona));
    }

    @GetMapping("maratonas")
    public List<Maratona> buscarMaratonas(){
        return maratonaService.buscarMaratona();
    }
    @GetMapping("maratona/{id}")
    public Maratona buscarMaratonaId(@PathVariable Long id){
        return maratonaService.buscarMaratonaId(id);
    }


}
