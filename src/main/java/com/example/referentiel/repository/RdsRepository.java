package com.example.referentiel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.referentiel.model.Rds;

import java.util.List;

@Repository
public interface RdsRepository extends JpaRepository<Rds, Long> {
    List<Rds> findByVpcId(Long vpcId);
    List<Rds> findByAccountId(Long accountId);
}
