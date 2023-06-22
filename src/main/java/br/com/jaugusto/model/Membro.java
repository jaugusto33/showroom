package br.com.jaugusto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Membro")
@Table(name = "membro")
public class Membro {
	@Id
	@Column(name = "idprojeto")
	private Long idProjeto;
	
	@Column(name = "idpessoa")
	private Long idPessoa;

	public Long getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(Long idProjeto) {
		this.idProjeto = idProjeto;
	}

	public Long getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}
	
	
	

}
