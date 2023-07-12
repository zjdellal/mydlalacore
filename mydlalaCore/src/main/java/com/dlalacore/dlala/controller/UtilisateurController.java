package com.dlalacore.dlala.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dlalacore.dlala.entities.Utilisateur;
import com.dlalacore.dlala.exception.UtilisateurNotFoundException;
import com.dlalacore.dlala.reposetories.UtilisateurReposetorie;

@RestController
@RequestMapping(value = "/")
public class UtilisateurController {
	// @Autowired(required = true)
	// private UtilisateursService userService;
	@Autowired()
	private UtilisateurReposetorie repositorie;

	@PostMapping(value = "/utilisateurs")
	public @ResponseBody List<Utilisateur> getUtilisateurs() {
		System.out.println("allo liste user");
		return repositorie.findAll();

	}

	@RequestMapping(value = "/utilisateur/{id}")
	@ResponseBody
	public Utilisateur getUtilisateurByName(@PathVariable Integer id) {
		System.out.println("user");
		return repositorie.findById(id).orElseThrow(() -> new UtilisateurNotFoundException(id));
	}

	// pas pour le moment

	@RequestMapping(value = "/addUtilisateur/{nom}/{prenom}/{courriel}/{password}")
	@ResponseStatus(HttpStatus.CREATED)

	public Utilisateur addUtilisateur(@RequestBody @PathVariable String nom, @PathVariable String prenom,
	    @PathVariable String courriel, @PathVariable String password) {

		Utilisateur newUtilisateur = new Utilisateur(nom, prenom, courriel, password);

		return repositorie.save(newUtilisateur);

	}

	@RequestMapping(value = "deleteUtilisateur/{id}")

	public void deleteUtilisateur(@PathVariable Integer id) {
		System.out.println("allo delete user");
		repositorie.deleteById(id);

	}

	@RequestMapping(value = "majUser/{id}")
	public Utilisateur replaceUtilisateur(@RequestBody Utilisateur majUser, @PathVariable Integer id) {
System.out.println("put request");
		return repositorie.findById(id).map(user -> {
			user.setNom_utilisateur(majUser.getNom_utilisateur());
			user.setPrenom_utilisateur(majUser.getPrenom_utilisateur());
			return repositorie.save(user);
		}).orElseGet(() -> {
			majUser.setId(id);
			return repositorie.save(majUser);
		});

	}



}
