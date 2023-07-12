package com.dlalacore.dlala.services;

import java.util.List;

import com.dlalacore.dlala.entities.Utilisateur;

public interface UtilisateursService {
	Utilisateur save(Utilisateur utilisateur);

	List<Utilisateur> getAll();

	Utilisateur getUtilisateur(Integer userID);

	void delete(Utilisateur utilisateur);

}
