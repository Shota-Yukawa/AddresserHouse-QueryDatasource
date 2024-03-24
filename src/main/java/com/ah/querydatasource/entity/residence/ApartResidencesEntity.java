package com.ah.querydatasource.entity.residence;


import com.ah.querydatasource.entity.parts.SystemDateEntityParts;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "apart_residences")
@Data
@EqualsAndHashCode(callSuper = false)
public class ApartResidencesEntity extends SystemDateEntityParts {

	@Id
	@Column(name = "apart_residence_id")
	private Integer apartResidenceId;

	@Column(name = "consumer_id", nullable = false)
	private Integer consumerId;

	@Column(name = "apartment_id", nullable = false)
	private Integer apartmentId;

	@Column(name = "apart_room_id")
	private Integer roomNum;

}
