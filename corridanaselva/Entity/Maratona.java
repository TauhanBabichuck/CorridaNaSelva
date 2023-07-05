package com.example.corridanaselva.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Maratona {
    @Id
    private Long id;
    private String nome;

    @JsonIgnore
    @OneToMany(mappedBy = "maratona")
    private List<Circuito> circuitos;
}
