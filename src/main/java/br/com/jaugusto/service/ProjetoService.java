package br.com.jaugusto.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jaugusto.model.Projeto;
import br.com.jaugusto.repository.ProjetoRepository;

@Service
public class ProjetoService {
	
		
	@Autowired
	ProjetoRepository projetoRepository;

	//getting all projetos records
	public List<Projeto> getAllProjetos() {
		Projeto objProjeto;
		List<Projeto> projetos = new ArrayList<>();
		Iterator<Projeto> iterador = projetoRepository.findAll().iterator();
		while (iterador.hasNext()) {
			objProjeto = iterador.next();
			projetos.add(objProjeto);
		}

		return projetos;
	}

	//getting a specific projeto
	public Projeto getProjetoById(Long id) {
	  return projetoRepository.findById(id).get();
	}

	public void save(Projeto projeto) {
		projetoRepository.save (projeto);
	}
	
	public void update(Projeto projeto) {
		projetoRepository.save(projeto);
	}

	// deleting a specific projeto
	public void delete(Long id) {
		projetoRepository.deleteById(id);
	}

}
