package com.dlalacore.dlala.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dlalacore.dlala.entities.Fiche;
import com.dlalacore.dlala.reposetories.FicheRepositorie;

@RestController
@RequestMapping(value = "/")
public class FicheController {
	@Autowired()
	private FicheRepositorie repositorie;

	
	@GetMapping(value = "/fiches")
	public @ResponseBody ResponseEntity<List<Fiche>> getFiches() {
		System.out.println("allo liste Fiches");
		List<Fiche> fiches = repositorie.findAll();
		if (fiches == null)
			return new ResponseEntity<List<Fiche>>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<List<Fiche>>(fiches, HttpStatus.OK);

	}
	
	@GetMapping(value = "/fichesbyid/{idPhone}")
	public @ResponseBody ResponseEntity<List<Fiche>> getFichesByPhoneId(@PathVariable Integer idPhone) {
		
		List<Fiche> fiches = repositorie.getFichesByPhoneId(idPhone);
		if (fiches == null)
			return new ResponseEntity<List<Fiche>>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<List<Fiche>>(fiches, HttpStatus.OK);

	}
}
