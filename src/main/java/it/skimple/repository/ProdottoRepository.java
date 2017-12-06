package it.skimple.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.skimple.entity.Prodotto;

public interface ProdottoRepository  extends JpaRepository<Prodotto, Long>{

}
