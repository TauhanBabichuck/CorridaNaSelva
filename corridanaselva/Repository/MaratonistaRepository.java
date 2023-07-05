package com.example.corridanaselva.Repository;

import com.example.corridanaselva.Entity.Maratonista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaratonistaRepository extends JpaRepository<Maratonista, Long>{

}
