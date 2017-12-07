package it.skimple.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.skimple.entity.Prodotto;
import it.skimple.service.ProdottoService;

@RestController
public class ProdottoController {

	@Autowired
	ProdottoService service;
	
	@GetMapping("/prodotto/{idProdotto}")
	public Prodotto getProdotto(@PathVariable("idProdotto") long idProdotto){
		return service.get(idProdotto);
	}
	
	@PostMapping("/prodotto/")
	public Prodotto saveProdotto(@Valid @RequestBody Prodotto prodotto) {
		return service.save(prodotto);
	}
	
}
