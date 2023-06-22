package br.com.jaugusto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jaugusto.model.Membro;
import br.com.jaugusto.repository.MembroRepository;

@Service
public class MembroService {

	@Autowired
	MembroRepository membroRepository;
	
	public void save(Membro membro) {
		membroRepository.save (membro);
	}
	
}
