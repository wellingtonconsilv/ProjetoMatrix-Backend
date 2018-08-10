package br.com.projetomatrix.academico.models;

import java.math.BigDecimal;

import br.com.projetomatrix.academico.*;
import br.com.projetomatrix.academico.enumeracoes.Modo;

public class Avaliacao {
	private Turma turma;
	private Aluno aluno;
	private Modo modo;
	private BigDecimal nota;
	private Integer codigo;
	private String dataRealizacao;
	private Professor responsavelAplicacao;

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Modo getModo() {
		return modo;
	}

	public void setModo(Modo modo) {
		this.modo = modo;
	}

	public BigDecimal getNota() {
		return nota;
	}

	public void setNota(BigDecimal nota) {
		this.nota = nota;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDataRealizacao() {
		return dataRealizacao;
	}

	public void setDataRealizacao(String dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}

	public Professor getResponsavelAplicacao() {
		return responsavelAplicacao;
	}

	public void setResponsavelAplicacao(Professor responsavelAplicacao) {
		this.responsavelAplicacao = responsavelAplicacao;
	}

}
