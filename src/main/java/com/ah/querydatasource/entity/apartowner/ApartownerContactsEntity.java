package com.ah.querydatasource.entity.apartowner;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "apartowner_contacts")
@Data
@EqualsAndHashCode(callSuper = false)
public class ApartownerContactsEntity {

	@Id
	@Column(name = "apartowner_contact_id")
	private Integer apartownerContactsId;

	@OneToOne
	@JoinColumn(name = "apartowner_id", referencedColumnName = "apartowner_id")
	private ApartownersEntity apartowner;

	@Column(name = "can_phone", nullable = false)
	private boolean canPhone;

	@Column(name = "can_mail", nullable = false)
	private boolean canMail;

	@Column(name = "can_chat", nullable = false)
	private boolean canChat;
}
