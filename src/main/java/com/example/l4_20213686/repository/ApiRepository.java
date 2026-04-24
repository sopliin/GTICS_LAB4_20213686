package com.example.l4_20213686.repository;

import com.example.l4_20213686.entity.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApiRepository extends JpaRepository<Api, Integer> {

    @Query(value = "select * from apis",
            nativeQuery = true)
    List<Api> obtenerApis();



}
