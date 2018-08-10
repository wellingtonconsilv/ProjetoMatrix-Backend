package br.com.projetomatrix.academico.models;

public class GeraCodigo {
	Integer codigoTurma = new Integer(0);
	Integer codigoDisciplina = new Integer(0);
	Integer codigoCurso = new Integer(0);
	Integer codigoAvaliacao = new Integer(0);
	Integer codigoHorario = new Integer(0);
	Integer codigoBoletim = new Integer(0);
	
	public Integer gerarCodigo(Turma turma) {
		if (turma == null)
			throw new IllegalArgumentException();
		codigoTurma++;
		return codigoTurma;

	}

	public Integer gerarCodigo(Disciplina disciplina) {
		if (disciplina == null)
			throw new IllegalArgumentException();
		codigoDisciplina++;
		return codigoDisciplina;

	}
	
	public Integer gerarCodigo(Curso curso) {
		if (curso == null)
			throw new IllegalArgumentException();
		codigoCurso++;
		return codigoCurso;

	}
	
	public Integer gerarCodigo(Avaliacao avaliacao) {
		if (avaliacao == null)
			throw new IllegalArgumentException();
		codigoAvaliacao++;
		return codigoAvaliacao;

	}
	
	public Integer gerarCodigo(Horario horario) {
		if (horario == null)
			throw new IllegalArgumentException();
		codigoHorario++;
		return codigoAvaliacao;

	}

	public Integer gerarCodigo(Boletim boletim) {
		if (boletim == null)
			throw new IllegalArgumentException();
		codigoBoletim++;
		return codigoAvaliacao;

	}
}
