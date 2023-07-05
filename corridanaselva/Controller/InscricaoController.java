package com.example.corridanaselva.Controller;

import com.example.corridanaselva.Entity.Inscricao;
import com.example.corridanaselva.Service.InscricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2")
public class InscricaoController {

    @Autowired
    private InscricaoService inscricaoService;

    @PostMapping("add")
    public Inscricao salvarInscricao(@RequestBody Inscricao inscricao){
        return inscricaoService.salvarIncricao(inscricao);
    }

    @GetMapping("inscricoes")
    public List<Inscricao> buscarInscricoes(){
        return inscricaoService.buscarIncricoes();
    }

    @GetMapping("inscricao/{id}")
    public Inscricao buscarIncricaoId(@PathVariable Long id){
        return inscricaoService.buscarInscricaoId(id);
    }
}
