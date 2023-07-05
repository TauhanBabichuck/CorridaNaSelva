package com.example.corridanaselva.Repository;

import com.example.corridanaselva.Entity.Circuito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircuitoRepository extends JpaRepository<Circuito, Long> {

}
