package br.com.jaugusto.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jaugusto.model.Pessoa;
import br.com.jaugusto.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	//getting all pessoas records
	public List<Pessoa> getAllPessoas() {
		Pessoa objPessoa;
		List<Pessoa> listPessoa = new ArrayList<>();
		Iterator<Pessoa> iterador = pessoaRepository.findAll().iterator();
		while (iterador.hasNext()) {
			objPessoa = iterador.next();
			listPessoa.add(objPessoa);
		}

		return listPessoa;
	}
	
	// getting a specific pessoa
	public Pessoa getPessoaById(Long id) {
		return pessoaRepository.findById(id).get();
	}

}
