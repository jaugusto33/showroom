package br.com.jaugusto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.jaugusto.model.Membro;
import br.com.jaugusto.model.Pessoa;
import br.com.jaugusto.service.MembroService;
import br.com.jaugusto.service.PessoaService;

@RestController
public class MembroController {
	
	@Autowired
	MembroService membroService;  
	
	@Autowired
	PessoaService pessoaService;
	
	@RequestMapping(value = "/membro/cadastro", method = RequestMethod.POST)
	public ResponseEntity<?> cadastrarrMembro(@RequestBody Membro parametros) {
	 
	  Pessoa pessoa = pessoaService.getPessoaById(parametros.getIdPessoa());	
	 
	  if (pessoa.getIsFuncionario()) {
		 membroService.save(parametros);
		 return new ResponseEntity<>("Membro cadastrado com Sucesso", HttpStatus.CREATED);  
	  }
	   
	  return new ResponseEntity<>("Membro nao é funcionário. Operação Não realizada", HttpStatus.BAD_REQUEST);   
	    
	}

}
