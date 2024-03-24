package com.ah.querydatasource.entity.residence;


import com.ah.querydatasource.entity.parts.SystemDateEntityParts;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "addresser_residences")
@Data
@EqualsAndHashCode(callSuper = false)
public class AddresserResidencesEntity extends SystemDateEntityParts {

	@Id
	@Column(name = "addresser_residence_id")
	private Integer addresserResidenceId;

	@Column(name = "consumer_id", nullable = false)
	private Integer consumerId;

	@Column(name = "addresser_id", nullable = false)
	private Integer addresserId;

	@Column(name = "address_id", nullable = false)
	private Integer AddressId;

	@Column(name = "after_street")
	private String afterStreet;
}
