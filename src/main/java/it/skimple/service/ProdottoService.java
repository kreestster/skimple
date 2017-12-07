package it.skimple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.skimple.entity.Prodotto;
import it.skimple.repository.ProdottoRepository;

@Service
public class ProdottoService implements IService<Prodotto> {
	
	@Autowired
	ProdottoRepository repo;
	
	@Override
	public Prodotto get(long idProdotto){
		return repo.findOne(idProdotto);
	}
	
	@Override
	public Prodotto save(Prodotto prodotto) {
		return repo.save(prodotto);
	}

	@Override
	public Prodotto get(Prodotto t) {
		// TODO Auto-generated method stub
		return null;
	}
}
