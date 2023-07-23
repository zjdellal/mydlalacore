package com.dlalacore.dlala.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "fiche_phone")
public class Fiche implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id")
	@SequenceGenerator(name = "id", sequenceName = "phones_id_phone_seq", schema = "public", allocationSize = 1)
	@Column(name = "id", updatable = false, nullable = false, columnDefinition = "UUID", unique = true)
	private Integer	id;
	

	@ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinColumn(name="id_phone", nullable=true)
  private Phone phone;
	
  
  @Column(name="titre_fiche")
  private String titre;
  
  @Column(name="date_fiche")
  private String date;
  
  @Column(name="cout_fiche")
  private String cout;
  
  @Column(name="details_fiche")
  private String details;
  
  public Fiche() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		phone = phone;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCout() {
		return cout;
	}

	public void setCout(String cout) {
		this.cout = cout;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
  
  
}


