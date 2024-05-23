package com.traini8.tcr.repository;

import com.traini8.tcr.entity.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingCenterRepository extends JpaRepository<TrainingCenter,Long> {
}
