package com.example.demo.service;

import com.example.demo.entity.Algorithm;
import com.example.demo.repository.AlgorithmRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.springframework.stereotype.Service;
import com.example.demo.service.algorithm.SelectionSort;
import com.example.demo.service.algorithm.InsertionSort;
import com.example.demo.service.algorithm.BubbleSort;

import java.util.List;
import java.util.Random;

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
    public void deleteAlgorithm(long id) {
        algorithmRepository.deleteById(id);
    }

    /**
     *
     * {@inheritDoc}
     */
    @Override
    public ImmutablePair<Long, String> solve(long id, int[] arr) {
        switch ((int)id){
            case (1):
                long time = System.currentTimeMillis();
                String sortedStr = (new BubbleSort()).sort(arr);
                return new ImmutablePair<>(System.currentTimeMillis() - time, sortedStr);
            case (2):
                time = System.currentTimeMillis();
                sortedStr = (new SelectionSort()).sort(arr);
                return new ImmutablePair<>(System.currentTimeMillis() - time, sortedStr);
            case (3):
                time = System.currentTimeMillis();
                sortedStr = (new InsertionSort()).sort(arr);
                return new ImmutablePair<>(System.currentTimeMillis() - time, sortedStr);
            default:
                return new ImmutablePair<>(0L, "");
        }
    }

    @Override
    public Long solveRnd(long id, int countOfNumbers){
        int[] arr = new Random().ints(countOfNumbers, 0, 10000).toArray();
        return solve(id, arr).left;
    }
}
