package com.example.corridanaselva.Repository;

import com.example.corridanaselva.Entity.Maratona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaratonaRepository extends JpaRepository<Maratona , Long> {

}
