package com.ah.querydatasource.entity.parts;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public class SystemDateEntityParts implements Serializable {

	@Column(name = "regist_at", columnDefinition = "TIMESTAMP")
	private LocalDateTime registAt;

	@Column(name = "update_at", columnDefinition = "TIMESTAMP")
	private LocalDateTime updateAt;
}
