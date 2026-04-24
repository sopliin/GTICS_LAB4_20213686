package com.example.l4_20213686.repository;

import com.example.l4_20213686.entity.Api;
import com.example.l4_20213686.entity.Endpoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EndpointRepository extends JpaRepository<Endpoint, Integer> {

}
