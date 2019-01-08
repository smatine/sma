package com.example.referentiel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.referentiel.model.Kms;
import com.example.referentiel.model.User;

import java.util.List;

@Repository
public interface KmsRepository extends JpaRepository<Kms, Long> {
	List<Kms> findByAccountId(Long accountId);
}
