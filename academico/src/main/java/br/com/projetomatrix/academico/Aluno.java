package br.com.projetomatrix.academico;

import java.util.List;

import br.com.projetomatrix.academico.curso.Avaliacao;
import br.com.projetomatrix.academico.curso.Curso;

public class Aluno extends Pessoa {
	private Curso curso;
	private List<Avaliacao> avaliacao;

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<Avaliacao> getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(List<Avaliacao> avaliacao) {
		this.avaliacao = avaliacao;
	}

}
