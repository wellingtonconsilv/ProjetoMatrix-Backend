package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.GeraCodigo;
import br.com.projetomatrix.academico.curso.Curso;

public class CursoService {
	Map<Integer, Curso> hashCurso = new HashMap<Integer, Curso>();
	GeraCodigo gerarCodigo = new GeraCodigo();

	public Curso cadastarCurso(Curso curso) {
		if (curso == null && hashCurso.containsKey(curso.getCodigo() == 0))
			throw new IllegalArgumentException();

		hashCurso.put(gerarCodigo.gerarCodigo(curso), curso);
		return curso;
	}

	public void removerCurso(Curso curso) {
		if (curso == null)
			throw new IllegalArgumentException();
		hashCurso.remove(curso.getCodigo());

	}

	public Curso atualizarCurso(Curso curso) {
		if (curso == null || curso.getCodigo() == 0)
			throw new IllegalArgumentException();
		removerCurso(curso);
		cadastarCurso(curso);
		return curso;
	}

	public Curso recuperarCurso(Curso curso) {
		if (curso == null || curso.getCodigo() == 0)
			throw new IllegalArgumentException();

		return hashCurso.get(curso.getCodigo());

	}

}
