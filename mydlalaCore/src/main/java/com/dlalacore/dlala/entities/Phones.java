package com.dlalacore.dlala.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "phones")
public class Phones implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_phone")
	@SequenceGenerator(name = "id_phone", sequenceName = "phones_id_phone_seq", schema = "public", allocationSize = 1)
	@Column(name = "id_phone", updatable = false, nullable = false, columnDefinition = "UUID", unique = true)
	private Integer	id;

	@Column(name = "marque_phone")
	private String	marque;

	@Column(name = "model_phone")
	private String	model;

	@Column(name = "etat_phone")
	private Enum		etat;

	@Column(name = "batterie_phone")
	private String	etatBatterie;

	@Column(name = "accessoires_phone")
	private String	accessoires;

	@Column(name = "prix_achat_phone")
	private String	prixAchat;

	@Column(name = "prix_vente_phone")
	private String	prixVentes;

	@Column(name = "cout_rep_article")
	private String	coutReparation;

	@Column(name = "cote_phone")
	private Enum		cotePhone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Enum getEtat() {
		return etat;
	}

	public void setEtat(Enum etat) {
		this.etat = etat;
	}

	public String getEtatBatterie() {
		return etatBatterie;
	}

	public void setEtatBatterie(String etatBatterie) {
		this.etatBatterie = etatBatterie;
	}

	public String getAccessoires() {
		return accessoires;
	}

	public void setAccessoires(String accessoires) {
		this.accessoires = accessoires;
	}

	public String getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(String prixAchat) {
		this.prixAchat = prixAchat;
	}

	public String getPrixVentes() {
		return prixVentes;
	}

	public void setPrixVentes(String prixVentes) {
		this.prixVentes = prixVentes;
	}

	public String getCoutReparation() {
		return coutReparation;
	}

	public void setCoutReparation(String coutReparation) {
		this.coutReparation = coutReparation;
	}

	public Enum getCotePhone() {
		return cotePhone;
	}

	public void setCotePhone(Enum cotePhone) {
		this.cotePhone = cotePhone;
	}
	
	
	
}
