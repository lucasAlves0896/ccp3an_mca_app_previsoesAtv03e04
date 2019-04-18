package br.usjt.hellospringboot.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.hellospringboot.model.Tempo;
import br.usjt.hellospringboot.repository.CadastroRepository;

@Service
public class PrevisaoTempoService {

	@Autowired
	private CadastroRepository tempoRepo;
	
	public void salvar(Tempo tempo) {
		tempoRepo.save(tempo);
	}
	
	public List <Tempo> listarTodos(){
		return tempoRepo.findAll();
	}
}
