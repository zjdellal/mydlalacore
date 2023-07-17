package com.dlalacore.dlala.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dlalacore.dlala.entities.Phone;
import com.dlalacore.dlala.reposetories.PhonesRepositorie;

@RestController
@RequestMapping(value = "/")
public class PhonesController {
	@Autowired()
	private PhonesRepositorie repositorie;

	@GetMapping(value = "/phones")
	public @ResponseBody ResponseEntity<List<Phone>> getPhones() {
		System.out.println("allo liste phones");
		List<Phone> phones = repositorie.findAll();
		if (phones == null)
			return new ResponseEntity<List<Phone>>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<List<Phone>>(phones, HttpStatus.OK);

	}

	@RequestMapping(value = "addPhone")

	public Phone putPhone(@RequestBody Phone phone) {

		return repositorie.save(phone);

	}

}
