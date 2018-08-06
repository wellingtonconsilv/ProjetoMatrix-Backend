package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.GeraCodigo;
import br.com.projetomatrix.academico.Turma;

public class TurmaService {
	Map<Integer, Turma> hashTurma = new HashMap<Integer, Turma>();
	GeraCodigo gerarCodigo = new GeraCodigo();

	public Turma cadastrarTurma(Turma turma) {
		if (turma == null && hashTurma.containsKey(turma.getCodigo() == 0))
			throw new IllegalArgumentException();
		
		hashTurma.put(gerarCodigo.gerarCodigo(turma), turma);
		return turma;
	}
	
	public void removerTurma(Turma turma) {
		if(turma == null)
			throw new IllegalArgumentException();
		hashTurma.remove(turma.getCodigo());
		
	}
	
	public Turma atualizarTurma(Turma turma) {
		if(turma == null || turma.getCodigo() == 0)
			throw new IllegalArgumentException();
		removerTurma(turma);
		cadastrarTurma(turma);
		return turma;
	}
	
	public Turma recuperarTurma(Turma turma) {
		if(turma == null || turma.getCodigo() == 0)
			throw new IllegalArgumentException();
		
		return hashTurma.get(turma.getCodigo());
		
	}
	
}
