package it.skimple.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Tag extends BaseEntity {

	@Column(name="nome")
	private String nome;
}
