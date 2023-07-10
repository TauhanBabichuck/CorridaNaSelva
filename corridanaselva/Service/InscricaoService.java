package com.example.corridanaselva.Service;


import com.example.corridanaselva.Entity.Circuito;
import com.example.corridanaselva.Entity.Inscricao;
import com.example.corridanaselva.Entity.Maratonista;
import com.example.corridanaselva.Repository.CircuitoRepository;
import com.example.corridanaselva.Repository.InscricaoRepository;
import com.example.corridanaselva.Repository.MaratonistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscricaoService {

    @Autowired
    private InscricaoRepository inscricaoRepository;
    @Autowired
    private MaratonistaRepository maratonistaRepository;
    @Autowired
    private CircuitoRepository circuitoRepository;

    public Inscricao salvarIncricao(Inscricao inscricao) {

        Maratonista maratonista = maratonistaRepository.findById(inscricao.getMaratonista().getId()).get();

        Circuito circuito = circuitoRepository.findById(inscricao.getCircuito().getId()).get();

       switch (circuito.getCategoria()) {
           case PEQUENO:
               if (maratonista.getIdade() > 18) {
                   inscricao.setValorInscricao(1300.0);
               } else {
                   inscricao.setValorInscricao(1500.0);
               }
               break;

           case MEDIO:
           if (maratonista.getIdade() > 18) {
               inscricao.setValorInscricao(2300.0);
           } else {
               inscricao.setValorInscricao(2200.0);
           }

           if (maratonista.getIdade() >= 18) {
               inscricao.setValorInscricao(2800.0);
           }else {
               throw new IllegalArgumentException("Sua idade não esta de acordo com as normas da maratona");
           }
           break;
       }

        return inscricaoRepository.save(inscricao);

    }
    public List<Inscricao> buscarIncricoes() {
        return inscricaoRepository.findAll();
    }
    public Inscricao buscarInscricaoId(Long id) {
        return inscricaoRepository.findById(id).get();
    }



}

