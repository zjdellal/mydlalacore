package com.dlalacore.dlala.reposetories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dlalacore.dlala.entities.Fiche;

public interface FicheRepositorie extends JpaRepository<Fiche, Integer> {
	
	@Query("SELECT f from  Fiche as f WHERE f.phone.id = :idPhone")
	List<Fiche> getFichesByPhoneId(@Param("idPhone") Integer idPhone);

}
