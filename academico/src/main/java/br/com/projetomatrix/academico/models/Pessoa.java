package br.com.projetomatrix.academico.models;

import br.com.projetomatrix.academico.enumeracoes.Status;

public abstract class Pessoa {
	private String nome;
	private String endereço;
	private String telefone;
	private String matricula;
	private Status status;
	private GeraMatricula gerar;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public GeraMatricula getGerar() {
		return gerar;
	}

	public void setGerar(GeraMatricula gerar) {
		this.gerar = gerar;
	}

}
