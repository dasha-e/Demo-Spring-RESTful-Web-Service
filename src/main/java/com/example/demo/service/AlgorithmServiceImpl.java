package com.example.demo.service;

import com.example.demo.entity.Algorithm;
import com.example.demo.repository.AlgorithmRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Getter
@Setter
public class AlgorithmServiceImpl implements AlgorithmService {

    private final AlgorithmRepository algorithmRepository;
    private Long ids = 3L;

    public AlgorithmServiceImpl(AlgorithmRepository algorithmRepository) {
        this.algorithmRepository = algorithmRepository;
    }

    @Override
    public Optional<Algorithm> getAlgorithm() {
        return algorithmRepository.findAlgorithmById(ids);
    }
}
