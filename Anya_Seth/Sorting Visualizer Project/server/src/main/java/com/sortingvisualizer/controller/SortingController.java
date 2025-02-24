package com.sortingvisualizer.controller;

import com.sortingvisualizer.model.SortingRequest;
import com.sortingvisualizer.model.SortingResponse;
import com.sortingvisualizer.service.SortingService;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/sort")
public class SortingController {

    @Autowired
    private SortingService sortingService;

    @PostMapping
    public ResponseEntity<?> sortArray(@RequestBody SortingRequest request) {
        System.out.println("Received Request: " + request); // Debugging

        if (request.getAlgorithm() == null || request.getArray() == null) {
            return ResponseEntity.badRequest().body("Invalid request format");
        }

        SortingResponse response = sortingService.sort(request.getAlgorithm(), request.getArray());
        return ResponseEntity.ok(response);
    }
}
