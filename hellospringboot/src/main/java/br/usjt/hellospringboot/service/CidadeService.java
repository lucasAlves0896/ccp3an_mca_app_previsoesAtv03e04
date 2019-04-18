package br.usjt.hellospringboot.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.hellospringboot.model.Cidade;
import br.usjt.hellospringboot.repository.CidadeRepository;

public class CidadeService {

	@Autowired
	private CidadeRepository repo;

	public List<Cidade> listarCidade() {
		return repo.findAll();
	}

	public void excluir(Cidade cidade) {
		repo.delete(cidade);
	}

	public void salvar(Cidade cidade) {
		repo.save(cidade);
	}

}
