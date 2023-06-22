package br.com.jaugusto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.jaugusto.model.Pessoa;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {  
} 


