package com.example.corridanaselva.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Inscricao {


    @Id
    private Long id;
    private Double valorInscricao;

    @ManyToOne
    private Maratonista maratonista;
    @ManyToOne
    private Circuito circuito;

}
