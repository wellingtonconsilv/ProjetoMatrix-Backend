package br.com.projetomatrix.academico;

import java.util.List;

public class Historico {
	private Aluno aluno;
	private List<Boletim> boletinsAluno;

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Boletim> getBoletinsAluno() {
		return boletinsAluno;
	}

	public void setBoletinsAluno(List<Boletim> boletinsAluno) {
		this.boletinsAluno = boletinsAluno;
	}

}
