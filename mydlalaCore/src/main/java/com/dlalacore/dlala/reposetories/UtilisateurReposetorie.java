package com.dlalacore.dlala.reposetories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dlalacore.dlala.entities.Utilisateur;

@Repository
public interface UtilisateurReposetorie extends JpaRepository<Utilisateur, Integer>{

}
