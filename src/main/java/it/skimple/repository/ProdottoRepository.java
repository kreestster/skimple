package it.skimple.repository;

import java.util.Calendar;
import java.util.Collection;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import it.skimple.entity.Prodotto;

public interface ProdottoRepository  extends JpaRepository<Prodotto, Long>{
	
	@Transactional(readOnly = true)
	@Cacheable("cacheProdotti")
	@Query("select p from Prodotto p where p.nomeProdotto like %:nome%")
	Collection<Prodotto> findByNomeProdotto(@Param("nome") String nomeProdotto);
	
	Prodotto findByUpdateDate(Calendar updateDate);
}
