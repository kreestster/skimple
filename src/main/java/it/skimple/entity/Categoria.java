package it.skimple.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Categoria extends BaseEntity {
	@Column(name="descrizione")
	private String descrizione;
}
