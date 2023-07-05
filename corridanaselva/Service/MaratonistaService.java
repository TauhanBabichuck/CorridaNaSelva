package com.example.corridanaselva.Service;

import com.example.corridanaselva.Entity.Maratonista;
import com.example.corridanaselva.Repository.MaratonistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaratonistaService {

    @Autowired
    private MaratonistaRepository maratonistaRepository;

    public Maratonista salvarMaratonista(Maratonista maratonista) {
        return maratonistaRepository.save(maratonista);
    }
    public List<Maratonista> buscarMaratonistas() {
        return maratonistaRepository.findAll();
    }
    public Maratonista buscarMaratonistaId(Long id) {
        return maratonistaRepository.findById(id).get();
    }

}
