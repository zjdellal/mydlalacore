package com.dlalacore.dlala.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "phones")
public class Phone implements Serializable {

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
	private String	etat;

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
	private String	cotePhone;

	@Column(name = "date_achat_phone")
	private String	dateAchat;

	@Column(name = "date_vente_phone")
	private String	dateVente;

	@Column(name = "date_maj_phone")
	private String	dateMaj;

	@Column(name = "statut_phone")
	private String	statutPhone;
	



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

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
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

	public String getPrixVente() {
		return prixVentes;
	}

	public void setPrixVente(String prixVentes) {
		this.prixVentes = prixVentes;
	}

	public String getCoutReparation() {
		return coutReparation;
	}

	public void setCoutReparation(String coutReparation) {
		this.coutReparation = coutReparation;
	}

	public String getCotePhone() {
		return cotePhone;
	}

	public void setCotePhone(String cotePhone) {
		this.cotePhone = cotePhone;
	}

	public String getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(String dateAchat) {
		this.dateAchat = dateAchat;
	}

	public String getDateVente() {
		return dateVente;
	}

	public void setDateVente(String dateVente) {
		this.dateVente = dateVente;
	}

	public String getDateMaj() {
		return dateMaj;
	}

	public void setDateMaj(String dateMaj) {
		this.dateMaj = dateMaj;
	}
	
	

	public String getStatutPhone() {
		return statutPhone;
	}

	public void setStatutPhone(String statutPhone) {
		this.statutPhone = statutPhone;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", marque=" + marque + ", model=" + model + ", etat=" + etat + ", etatBatterie="
		    + etatBatterie + ", accessoires=" + accessoires + ", prixAchat=" + prixAchat + ", prixVentes=" + prixVentes
		    + ", coutReparation=" + coutReparation + ", cotePhone=" + cotePhone + ", dateAchat=" + dateAchat
		    + ", dateVente=" + dateVente + ", dateMaj=" + dateMaj + "]";
	}

}
