package com.traini8.tcr.service;

import com.traini8.tcr.entity.TrainingCenter;
import com.traini8.tcr.repository.TrainingCenterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrainingCenterService {
    private final TrainingCenterRepository trainingCenterRepository;

    public TrainingCenter save(TrainingCenter trainingCenter){
        return trainingCenterRepository.save(trainingCenter);
    }

    public List<TrainingCenter> findAll(){
        return trainingCenterRepository
                .findAll();
    }
}
