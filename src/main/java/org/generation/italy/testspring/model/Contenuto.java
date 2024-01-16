package org.generation.italy.testspring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Contenuto implements Comparable<Contenuto> {
	
	@Id     
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false)
	private String titolo;
	
	@Column(nullable=false)
	private String tipologia;
	
	@Column(nullable=false)
	private String genere;
	
	@Column(nullable=false)
	private Integer annoDiProduzione;
	
	@Column(nullable=false)
	private Integer durata;
	
	@ManyToOne(optional = false)
	private Regista regista;
	
	public Contenuto() {
		super();
	}

	public Contenuto(String titolo, String tipologia, String genere, Integer annoDiProduzione, Integer durata) {
		super();
		this.titolo = titolo;
		this.tipologia = tipologia;
		this.genere = genere;
		this.annoDiProduzione = annoDiProduzione;
	}

	
	public int getId() {
		return id;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getTipologia() {
		return tipologia;
	}

	public String getGenere() {
		return genere;
	}

	public Integer getAnnoDiProduzione() {
		return annoDiProduzione;
	}

	public Integer getDurata() {
		return durata;
	}

	public Regista getRegista() {
		return regista;
	}

	@Override
	public String toString() {
		return "Contenuto [titolo=" + titolo + ", tipologia=" + tipologia + ", genere=" + genere + ", annoDiProduzione="
				+ annoDiProduzione + ", Durata=" + durata + "]";
	}

	@Override
	public int compareTo(Contenuto o ) { //compareTo per stringhe
	 return this.titolo.compareTo(o.getTitolo());
	}
	
	
	
	
}
