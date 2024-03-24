package com.ah.querydatasource.repository.residence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ah.querydatasource.entity.residence.AddresserResidencesEntity;


@Repository
public interface AddresserResidencesRepository extends JpaRepository<AddresserResidencesEntity, Integer> {
	
}
