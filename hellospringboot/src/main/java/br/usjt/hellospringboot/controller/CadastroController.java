package br.usjt.hellospringboot.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.servlet.ModelAndView;

import br.usjt.hellospringboot.service.PrevisaoTempoService;
import br.usjt.hellospringboot.model.Tempo;


@Controller
public class CadastroController {

	@Autowired
	private PrevisaoTempoService previsaoTempoService;
	
	@GetMapping("/cadastro")
	public ModelAndView listarTempos() {
		ModelAndView mv = new ModelAndView("cadastroTempo");
		
		List<Tempo> tempo = previsaoTempoService.listarTodos();
		
		mv.addObject("tempos", tempo);
		
		return mv;
		
	}

	
}
