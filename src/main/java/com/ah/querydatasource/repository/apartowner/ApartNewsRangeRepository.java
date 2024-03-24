package com.ah.querydatasource.repository.apartowner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ah.querydatasource.entity.apartowner.ApartNewsRangeEntity;


@Repository
public interface ApartNewsRangeRepository extends JpaRepository<ApartNewsRangeEntity, Integer> {

}
