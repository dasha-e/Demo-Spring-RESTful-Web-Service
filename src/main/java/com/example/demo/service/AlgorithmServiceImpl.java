package com.example.demo.service;

import com.example.demo.DTO.SortObjectDTO;
import com.example.demo.entity.Algorithm;
import com.example.demo.repository.AlgorithmRepository;
import com.example.demo.service.algorithm.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
        long time = System.currentTimeMillis();
        String sortedArray = context.executeSortingStrategy(arr);
        return new SortObjectDTO(System.currentTimeMillis() - time, sortedArray);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortObjectDTO solveRnd(long id, int countOfNumbers) {
        int[] arr = new Random().ints(countOfNumbers, 0, 10000).toArray();
        return new SortObjectDTO(solve(id, arr).getTime(), "Random array has been sorted.");
    }
}
