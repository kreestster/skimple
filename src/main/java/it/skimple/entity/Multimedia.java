package it.skimple.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Multimedia extends BaseEntity {
	@Column(name="uri")
	private String uri;
}
