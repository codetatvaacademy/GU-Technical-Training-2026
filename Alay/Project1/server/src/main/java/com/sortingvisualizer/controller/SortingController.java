package com.sortingvisualizer.controller;

// import org.slf4j.Logger;
import com.sortingvisualizer.model.SortingRequest;
import com.sortingvisualizer.service.SortingService;
// import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
// import org.springframework.http.HttpStatus;
// import java.util.List;
// import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/sort")
public class SortingController {

    // private static final Logger logger = LoggerFactory.getLogger(SortingController.class);
    private final SortingService sortingService;

    public SortingController(SortingService sortingService) {
        this.sortingService = sortingService;
    }

    @PostMapping
    public ResponseEntity<?> sort(@RequestBody SortingRequest request) {
        System.out.println("Received request: " + request);
        return ResponseEntity.ok(sortingService.sort(request.getAlgorithm(), request.getArray()));
    }

}