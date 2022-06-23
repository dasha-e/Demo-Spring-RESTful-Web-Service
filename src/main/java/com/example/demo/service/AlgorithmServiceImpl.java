package com.example.demo.service;

import com.example.demo.entity.Algorithm;
import com.example.demo.repository.AlgorithmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlgorithmServiceImpl implements AlgorithmService {

    private final AlgorithmRepository algorithmRepository;

    /**
     *
     * {@inheritDoc}
     */
    @Override
    public List<Algorithm> getAllAlgorithms() {
        return algorithmRepository.findAllAlgorithms();
    }

    /**
     *
     * {@inheritDoc}
     */
    @Override
    public void saveAlgorithm(Algorithm algorithm) {
        algorithmRepository.save(algorithm);
    }

    /**
     *
     * {@inheritDoc}
     */
    @Override
    public void updateAlgorithm(Algorithm algorithm) {
        if (algorithmRepository.existsById(algorithm.getId())) {
            algorithmRepository.updateAlgorithm(algorithm.getId(), algorithm.getTitle(), algorithm.getDescr());
        }
        algorithmRepository.save(algorithm);
    }

    /**
     *
     * {@inheritDoc}
     */
    @Override
    public void deleteAlgorithm(Long id) {
        algorithmRepository.deleteById(id);
    }
}
