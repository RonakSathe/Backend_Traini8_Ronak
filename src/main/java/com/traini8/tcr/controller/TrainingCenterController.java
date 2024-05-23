package com.traini8.tcr.controller;

import com.traini8.tcr.entity.TrainingCenter;
import com.traini8.tcr.service.TrainingCenterService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
@Validated
@RequiredArgsConstructor
public class TrainingCenterController {

    private final TrainingCenterService trainingCenterService;

    @PostMapping
    public ResponseEntity<TrainingCenter> createCenter(@Valid @RequestBody TrainingCenter trainingCenter){
        TrainingCenter savedCenter = trainingCenterService.save(trainingCenter);
        return ResponseEntity.ok(savedCenter);
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllCenters(){
        List<TrainingCenter> centers = trainingCenterService.findAll();
        return ResponseEntity.ok(centers);
    }

}
