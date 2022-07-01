package com.example.demo.service;

import com.example.demo.DTO.SortObjectDTO;
import com.example.demo.entity.Algorithm;
import com.example.demo.repository.AlgorithmRepository;
import com.example.demo.service.algorithm.AlgorithmContext;
import com.example.demo.service.algorithm.SortingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class AlgorithmServiceImpl implements AlgorithmService {

    private final AlgorithmRepository algorithmRepository;

    private final Map<String, SortingStrategy> sortingStrategyMap;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Algorithm> getAllAlgorithms() {
        return algorithmRepository.findAllAlgorithms();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveAlgorithm(String title, String descr) {
        Algorithm algorithm = new Algorithm();
        algorithm.setTitle(title);
        algorithm.setDescr(descr);
        algorithmRepository.save(algorithm);
    }

    /**
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
     * {@inheritDoc}
     */
    @Override
    public void deleteAlgorithm(long id) {
        algorithmRepository.deleteById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortObjectDTO solve(long id, int[] arr) {
        AlgorithmContext context = new AlgorithmContext(sortingStrategyMap.get(Long.toString(id)));
        long timeBefore = System.nanoTime();
        context.executeSortingStrategy(arr);
        long timeAfter = System.nanoTime();
        return new SortObjectDTO((timeAfter - timeBefore) / 1000000 + " msec", Arrays.toString(arr));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortObjectDTO solveRnd(long id, int countOfNumbers, boolean sorted) {
        int[] arr = new Random().ints(countOfNumbers, 0, 10000).toArray();
        if (sorted) {
            solve(id, arr);
        }
        return new SortObjectDTO(solve(id, arr).getTime(), "Random array has been sorted.");
    }
}
