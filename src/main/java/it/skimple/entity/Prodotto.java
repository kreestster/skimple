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
	
	@Column(name = "descrizione_breve")
	private String descrizioneBreve;

	@Column(name = "descrizione")
	private String descrizione;
	
	@Column(name = "prezzo_listino")
	private BigDecimal prezzoListino;
	
	@Column(name = "prezzo_offerta")
	private BigDecimal prezzoOfferta;

	//@ManyToOne
	@Column(name = "fornitore")
	private Fornitore fornitore;
	
	@Column(name = "url_esterna")
	private String urlEsterna;
	
	/**
	 * Testo che verrà utilizzato come descrizione da mostrare nel bottone
	 * */
	@Column(name = "testo_accessorio")
	private String testoAccessorio;
	
	@Column(name = "num_visualizzazioni")
	private Long numVisualizzazioni;
	
	@Column(name = "create_date")
	private Calendar createDate;
	
	@Column(name = "update_date")
	private Calendar updateDate;
	
	//@ManyToMany
	@Column(name = "categoria")
	private Categoria categoria;
	
	@Column(name = "id_esterno")
	private String idEsternoProdotto;
	
	//@ManyToMany
	@Column(name = "tag")
	private Tag tag;
	
	//@OneToMany
	@Column(name = "multimedia")
	private List<Multimedia> multimedia; 
	
}
