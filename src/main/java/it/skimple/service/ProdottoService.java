package it.skimple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.skimple.entity.Prodotto;
import it.skimple.repository.ProdottoRepository;

@Service
public class ProdottoService {
	
	@Autowired
	ProdottoRepository repo;
	
	public Prodotto getProdotto(long idProdotto){
		return repo.findOne(idProdotto);
	}
}
