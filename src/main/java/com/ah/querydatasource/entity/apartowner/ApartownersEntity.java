package com.ah.querydatasource.entity.apartowner;


import java.util.List;

import com.ah.querydatasource.entity.parts.SystemDateEntityParts;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "apartowners")
@Data
@EqualsAndHashCode(callSuper = false)
public class ApartownersEntity extends SystemDateEntityParts {

	@Id
	@Column(name = "apartowner_id")
	private Integer apartownerId;

	@Column(name = "apartowner_name", nullable = false)
	private String apartownerName;

	@Column(name = "apartowner_name_kana")
	private String apartownerNameKana;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "phone_number", nullable = false)
	private String phoneNumber;

	@Column(name = "max_user", nullable = false)
	private int maxUser = 5;

	@Column(name = "post_code")
	private String postCode;

	@Column(name = "address_id", nullable = false)
	private Integer addressId;

	@Column(name = "after_street")
	private String afterStreet;
	
	
	//リレーションマッピング
	@JsonIgnore
	@OneToMany(mappedBy = "apartowner")
	private List<ApartmentsEntity> apartments;
	
	@JsonIgnore
	@OneToOne(mappedBy = "apartowner")
	private ApartownerContactsEntity apartownerContact;
}
