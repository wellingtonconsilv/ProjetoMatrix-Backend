package br.com.projetomatrix.academico;

import java.util.List;

import br.com.projetomatrix.academico.curso.Avaliacao;

public class Boletim {
	Aluno aluno;
	Turma turma;
	Avaliacao[] avaliacoes = new Avaliacao[3];

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Avaliacao[] getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(Avaliacao[] avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

}
