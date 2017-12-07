package it.skimple.entity;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Prodotto extends BaseEntity{
	
	@Column(name = "nome_prodotto")
	@NotNull
	private String nomeProdotto;
	
	private String descrizioneBreve;

	private String descrizione;
	
	private BigDecimal prezzoListino;
	
	private BigDecimal prezzoOfferta;

	//@ManyToOne
	private Fornitore fornitore;
	
	private String urlEsterna;
	
	/**
	 * Testo che verrà utilizzato come descrizione da mostrare nel bottone
	 * */
	private String testoAccessorio;
	
	private Long numVisualizzazioni;
	
	private Calendar createDate;
	
	private Calendar updateDate;
	
	//@ManyToMany
	private Categoria categoria;
	
	private String idEsternoProdotto;
	
	//@ManyToMany
	private Tag tag;
	
	//@OneToMany
	private List<Multimedia> multimedia; 
	
}
