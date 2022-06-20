package com.example.demo.service;

import com.example.demo.entity.Algorithm;
import com.example.demo.repository.AlgorithmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AlgorithmServiceImpl implements AlgorithmService {

    private final AlgorithmRepository algorithmRepository;
    private Long ids = 3L;

    /**
     *
     * {@inheritDoc}
     */
    @Override
    public Optional<Algorithm> getAlgorithm() {
        return algorithmRepository.findAlgorithmById(ids);
    }
}
