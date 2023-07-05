package com.example.corridanaselva.Service;

import com.example.corridanaselva.Entity.Maratona;
import com.example.corridanaselva.Repository.MaratonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaratonaService {

    @Autowired
    private MaratonaRepository maratonaRepository;
    public Maratona salvarMaratona(Maratona maratona) {
        return maratonaRepository.save(maratona);
    }
    public List<Maratona> buscarMaratona() {
        return maratonaRepository.findAll();
    }
    public Maratona buscarMaratonaId(Long id) {
        return maratonaRepository.findById(id).get();
    }


}
