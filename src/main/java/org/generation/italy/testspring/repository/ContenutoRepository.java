package org.generation.italy.testspring.repository;



import java.util.List;

import org.generation.italy.testspring.model.Contenuto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContenutoRepository extends JpaRepository<Contenuto, Integer>{
	
	List<Contenuto> findByTitoloLike(String titolo);
	List<Contenuto> findByTipologia(String tipologia);
	List<Contenuto> findByGenere(String genere);
	List<Contenuto> findByAnnoDiProduzioneBetween(Integer annoDiProduzionePartenza, Integer annoDiProduzioneArrivo);
	
}
