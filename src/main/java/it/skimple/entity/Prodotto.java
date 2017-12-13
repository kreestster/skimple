package it.skimple.entity;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

	@ManyToOne
	@JoinColumn(name = "fornitore")
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
	
	@ManyToMany
	@Column(name = "categoria")
	private List<Categoria> categoria;
	
	@Column(name = "id_esterno")
	private String idEsternoProdotto;
	
	@ManyToMany
	private List<Tag> tag;
	
	@OneToMany
	@Column(name = "multimedia")
	private List<Multimedia> multimedia;

	public String getNomeProdotto() {
		return nomeProdotto;
	}

	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}

	public String getDescrizioneBreve() {
		return descrizioneBreve;
	}

	public void setDescrizioneBreve(String descrizioneBreve) {
		this.descrizioneBreve = descrizioneBreve;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public BigDecimal getPrezzoListino() {
		return prezzoListino;
	}

	public void setPrezzoListino(BigDecimal prezzoListino) {
		this.prezzoListino = prezzoListino;
	}

	public BigDecimal getPrezzoOfferta() {
		return prezzoOfferta;
	}

	public void setPrezzoOfferta(BigDecimal prezzoOfferta) {
		this.prezzoOfferta = prezzoOfferta;
	}

	public Fornitore getFornitore() {
		return fornitore;
	}

	public void setFornitore(Fornitore fornitore) {
		this.fornitore = fornitore;
	}

	public String getUrlEsterna() {
		return urlEsterna;
	}

	public void setUrlEsterna(String urlEsterna) {
		this.urlEsterna = urlEsterna;
	}

	public String getTestoAccessorio() {
		return testoAccessorio;
	}

	public void setTestoAccessorio(String testoAccessorio) {
		this.testoAccessorio = testoAccessorio;
	}

	public Long getNumVisualizzazioni() {
		return numVisualizzazioni;
	}

	public void setNumVisualizzazioni(Long numVisualizzazioni) {
		this.numVisualizzazioni = numVisualizzazioni;
	}

	public Calendar getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Calendar createDate) {
		this.createDate = createDate;
	}

	public Calendar getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Calendar updateDate) {
		this.updateDate = updateDate;
	}

	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}

	public String getIdEsternoProdotto() {
		return idEsternoProdotto;
	}

	public void setIdEsternoProdotto(String idEsternoProdotto) {
		this.idEsternoProdotto = idEsternoProdotto;
	}

	public List<Tag> getTag() {
		return tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;
	}

	public List<Multimedia> getMultimedia() {
		return multimedia;
	}

	public void setMultimedia(List<Multimedia> multimedia) {
		this.multimedia = multimedia;
	} 
	
}
