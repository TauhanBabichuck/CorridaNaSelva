package com.example.corridanaselva.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Maratonista {

    @Id
    private Long id;
    private int idade;
    private String nome;
    private String sobrenome;
    private int rg;
    private int numeroCelular;
    private int numeroEmergencia;
    private String grupoSanguineo;

    @JsonIgnore
    @OneToMany(mappedBy = "maratonista")
    private List<Inscricao> inscricoes;
}
