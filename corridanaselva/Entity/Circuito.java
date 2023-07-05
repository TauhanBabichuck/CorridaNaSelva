package com.example.corridanaselva.Entity;

import com.example.corridanaselva.Entity.Enum.Categoria;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Circuito {

    @Id
    private Long id;
    private int distancia;
    private Categoria categoria;

    @JsonIgnore
    @OneToMany(mappedBy = "circuito")
    private List<Inscricao> inscricoes;

    @ManyToOne
    private Maratona maratona;

}
