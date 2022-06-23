package com.example.demo.repository;

import com.example.demo.entity.Algorithm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface AlgorithmRepository extends JpaRepository<Algorithm, Long> {

    @Query("SELECT u FROM Algorithm u")
    List<Algorithm> findAllAlgorithms();

    @Transactional
    @Modifying
    @Query("UPDATE Algorithm u SET u.title = :title, u.descr = :descr WHERE u.id = :id")
    void updateAlgorithm(long id, String title, String descr);
}
