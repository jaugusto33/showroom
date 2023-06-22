package br.com.jaugusto.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Projeto")
@Table(name = "projeto")
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome")
	private String dsNome;
	
	@Column(name = "data_inicio")
	private Date dtInicio;

	@Column(name = "data_previsao_fim")
	private Date dtPrevisaoFim;
	
	@Column(name = "data_fim")
	private Date dtFim;

	@Column(name = "descricao")
	private String dsDescricao;
	
	@Column(name = "status")
	private String dsStatus;
	
	@Column(name = "orcamento")
	private BigDecimal vlOrcamento;

	@Column(name = "risco")
	private String dsRisco;
	
	@Column(name = "idgerente")
	private Long idGerente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDsNome() {
		return dsNome;
	}

	public void setDsNome(String dsNome) {
		this.dsNome = dsNome;
	}

	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Date getDtPrevisaoFim() {
		return dtPrevisaoFim;
	}

	public void setDtPrevisaoFim(Date dtPrevisaoFim) {
		this.dtPrevisaoFim = dtPrevisaoFim;
	}

	public Date getDtFim() {
		return dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	public String getDsDescricao() {
		return dsDescricao;
	}

	public void setDsDescricao(String dsDescricao) {
		this.dsDescricao = dsDescricao;
	}

	public String getDsStatus() {
		return dsStatus;
	}

	public void setDsStatus(String dsStatus) {
		this.dsStatus = dsStatus;
	}

	public BigDecimal getVlOrcamento() {
		return vlOrcamento;
	}

	public void setVlOrcamento(BigDecimal vlOrcamento) {
		this.vlOrcamento = vlOrcamento;
	}

	public String getDsRisco() {
		return dsRisco;
	}

	public void setDsRisco(String dsRisco) {
		this.dsRisco = dsRisco;
	}

	public Long getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Long idGerente) {
		this.idGerente = idGerente;
	}

	


}
