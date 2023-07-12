package com.dlalacore.dlala.exception;

@SuppressWarnings("serial")
public class UtilisateurNotFoundException extends RuntimeException {

	public UtilisateurNotFoundException(Integer id) {
		super("Utilisateur non trouvé:"+ id);
	}
}
