package it.skimple.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Categoria extends BaseEntity {
	@Column(name = "descrizione")
	private String descrizione;

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}
