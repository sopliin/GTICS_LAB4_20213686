package com.example.l4_20213686.repository;

import com.example.l4_20213686.entity.Api;
import com.example.l4_20213686.entity.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Integer> {

}
