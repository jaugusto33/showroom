package br.com.jaugusto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import br.com.jaugusto.model.Projeto;

@Repository
public interface ProjetoRepository extends CrudRepository<Projeto, Long> {

}
