package com.dlalacore.dlala.reposetories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dlalacore.dlala.entities.Utilisateur;

@Repository
public interface UtilisateurReposetorie extends JpaRepository<Utilisateur, Integer>{
	
	
	@Query("select u from Utilisateur as u "
			+ "where (u.password_utilisateur= :password) "
			+ "and u.nom_utilisateur = :nom")
	Utilisateur Connect(@Param("password") String password, @Param("nom") String nom );

}
