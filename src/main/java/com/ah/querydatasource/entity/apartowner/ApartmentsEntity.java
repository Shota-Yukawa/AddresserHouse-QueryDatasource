package com.ah.querydatasource.entity.apartowner;

import java.time.LocalDate;
import java.util.List;

import com.ah.querydatasource.entity.parts.SystemDateEntityParts;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "apartments")
@Data
@EqualsAndHashCode(callSuper = false)
public class ApartmentsEntity extends SystemDateEntityParts {

	@Id
	@Column(name = "apartment_id")
	private Integer apartmentId;

	@ManyToOne
	@JoinColumn(name = "apartowner_id", nullable = false, referencedColumnName = "apartowner_id")
	private ApartownersEntity apartowner;

	@Column(name = "apart_name", nullable = false)
	private String apartName;

	@Column(name = "apart_name_kana")
	private String apartNameKana;

	@Column(name = "number_of_room")
	private int numOfRoom;

	@Column(name = "number_of_floor")
	private int numOfFloor;

	@Column(name = "build_on", columnDefinition = "TIMESTAMP")
	private LocalDate buildOn;

	@Column(name = "post_code")
	private String postCode;

	@Column(name = "address_id", nullable = false)
	private Integer addressId;

	@Column(name = "after_street")
	private String afterStreet;
	
	
	//リレーションマッピング
	@JsonIgnore
	@OneToMany(mappedBy = "apartment")
	private List<ApartRoomsEntity> apartRooms;

	@OneToMany(mappedBy = "apartment")
	@JsonIgnore
	private List<ApartNewsRangeEntity> apartNewsRanges;
}
