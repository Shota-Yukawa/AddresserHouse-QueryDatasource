
package com.ah.querydatasource.repository.apartowner;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ah.querydatasource.entity.apartowner.ApartmentsEntity;


@Repository
public interface ApartmentsRepository extends JpaRepository<ApartmentsEntity, Integer> {

	public List<ApartmentsEntity> findByApartowner_ApartownerIdAndApartName(Integer apartownerId, String apartName);
	
	public List<ApartmentsEntity> findByApartowner_ApartownerIdAndApartNameAndApartmentIdNot(Integer apartownerId, String apartName, Integer ApartmentId);
}
