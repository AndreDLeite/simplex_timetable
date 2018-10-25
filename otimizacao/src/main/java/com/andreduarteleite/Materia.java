package com.andreduarteleite;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class Materia {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String name;

	@Column
	private BigDecimal price;

	protected Materia() {
	}

	public Materia(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}
}
