package com.example.demo.controller;

import com.example.demo.DTO.SortObjectDTO;
import com.example.demo.entity.Algorithm;
import com.example.demo.service.AlgorithmService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Algorithm", description = "algorithm API")
@RestController
@RequiredArgsConstructor
public class AlgorithmController {
    //localhost:8080/
    private final AlgorithmService algorithmService;

    @Operation(summary = "Gets all algorithms", tags = "Get")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Found the algorithms",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = Algorithm.class)))
                    })
    })
    @RequestMapping(value = "/get-algorithm", method = RequestMethod.GET)
    public List<Algorithm> getAllAlgorithms() {
        return algorithmService.getAllAlgorithms();
    }

    @Operation(summary = "Add new algorithm into database", tags = "Post", parameters = {@Parameter(name = "title",
            description = "Title of new Algorithm."), @Parameter(name = "description", description = "Description of new Algorithm.")})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "New algorithm added",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = Algorithm.class)))
                    })
    })
    @RequestMapping(value = "/insert-algorithm", method = RequestMethod.POST)
    public void createAlgorithm(String title, String descr) {
        algorithmService.saveAlgorithm(title, descr);
    }

    @Operation(summary = "Update algorithm in database", tags = "Put")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Algorithm updated",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = Algorithm.class)))
                    })
    })
    @RequestMapping(value = "/update-algorithm", method = RequestMethod.PUT)
    public void updateAlgorithm(@RequestBody Algorithm algorithm) {
        algorithmService.updateAlgorithm(algorithm);
    }

    @Operation(summary = "Delete algorithm from database", tags = "Delete", parameters = {@Parameter(name = "id",description = "Algorithm id.")})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Algorithms deleted",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = Algorithm.class)))
                    })
    })
    @RequestMapping(value = "/delete-algorithm", method = RequestMethod.DELETE)
    public void deleteAlgorithm(Long id) {
        algorithmService.deleteAlgorithm(id);
    }

    @Operation(summary = "Sort given int array", description = "Sort given array of int by algorithm from database with id." +
            " Returns sorted array and the sort time in milliseconds", tags = "Solve", parameters = {@Parameter(name = "id",
            description = "Algorithm id."), @Parameter(name = "array", description = "Array, needed to be sorted.")})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Array sorted",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = Algorithm.class)))
                    })
    })
    @RequestMapping(value = "/sort-array", method = RequestMethod.GET)
    public SortObjectDTO solve(long id, int[] arr) {
        return algorithmService.solve(id, arr);
    }

    @Operation(summary = "Sort random int array", description = "Sort array of random int by algorithm from database with id. " +
            "Returns the sort time in milliseconds. If param sorted is true - the method calculates the sort time of an already sorted array.", tags = "Solve",
    parameters = {@Parameter(name = "id", description = "Algorithm id."), @Parameter(name = "countOfNumbers",
            description = "Count of numbers in random array."), @Parameter(name = "sorted", description = "If it's need to check the time of " +
            "sorting of an already sorted array - true, else - false.")})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Array sorted",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = Algorithm.class)))
                    })
    })
    @RequestMapping(value = "/sort-random-array", method = RequestMethod.GET)
    public SortObjectDTO solve(long id, int countOfNumbers, boolean sorted) {
        return algorithmService.solveRnd(id, countOfNumbers, sorted);
    }
}
