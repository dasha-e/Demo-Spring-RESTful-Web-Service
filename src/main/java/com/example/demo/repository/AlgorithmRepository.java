package com.example.demo.repository;

import com.example.demo.entity.Algorithm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlgorithmRepository extends JpaRepository<Algorithm, Long> {

    @Query(value = "SELECT * FROM Algorithm WHERE id = :id", nativeQuery = true)
    Optional<Algorithm> findAlgorithmById(Long id);
}
