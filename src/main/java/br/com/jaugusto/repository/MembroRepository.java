package br.com.jaugusto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import br.com.jaugusto.model.Membro;

@Repository
public interface MembroRepository extends CrudRepository<Membro, Long> {
}
