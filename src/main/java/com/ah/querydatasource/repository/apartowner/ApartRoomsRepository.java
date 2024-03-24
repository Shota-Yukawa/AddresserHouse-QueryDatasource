package com.ah.querydatasource.repository.apartowner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ah.querydatasource.entity.apartowner.ApartRoomsEntity;


@Repository
public interface ApartRoomsRepository extends JpaRepository<ApartRoomsEntity, Integer> {

}
