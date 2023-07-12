package com.dlalacore.dlala.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

//utilisateurs_id_utilisateur_seq

@SuppressWarnings("serial")
@Entity
@Table(name = "utilisateurs")
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_utilisateur")
	@SequenceGenerator(name = "id_utilisateur", sequenceName = "utilisateurs_id_utilisateur_seq", schema = "public", allocationSize = 1)
	@Column(name = "id_utilisateur", updatable = false, nullable = false, columnDefinition = "UUID", unique = true)
	private Integer	id;

	@Column(name = "nom_utilisateur")
	private String	nom_utilisateur;

	@Column(name = "prenom_utilisateur")
	private String	prenom_utilisateur;

	@Column(name = "courriel_utilisateur")

	private String	courriel_utilisateur;

	@Column(name = "password_utilisateur")
	private String	password_utilisateur;

	public Utilisateur() {

	}

	public Utilisateur(String nom, String prenom, String courriel, String password) {
		this.nom_utilisateur = nom;
		this.prenom_utilisateur = prenom;
		this.courriel_utilisateur = courriel;
		this.password_utilisateur = password;

	}

	public Integer getId() {
		return id;
	}

	public String getNom_utilisateur() {
		return nom_utilisateur;
	}

	public String getPrenom_utilisateur() {
		return prenom_utilisateur;
	}

	public String getCourriel_utilisateur() {
		return courriel_utilisateur;
	}

	public String getPassword_utilisateur() {
		return password_utilisateur;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPrenom_utilisateur(String prenom_utilisateur) {
		this.prenom_utilisateur = prenom_utilisateur;
	}

	public void setCourriel_utilisateur(String courriel_utilisateur) {
		this.courriel_utilisateur = courriel_utilisateur;
	}

	public void setPassword_utilisateur(String password_utilisateur) {
		this.password_utilisateur = password_utilisateur;
	}

	public void setNom_utilisateur(String nom) {
		this.nom_utilisateur = nom;
	}

}
