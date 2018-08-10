package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

import br.com.projetomatrix.academico.models.GeraCodigo;
import br.com.projetomatrix.academico.models.Turma;

public class TurmaService {
	Map<Integer, Turma> hashTurma = new HashMap<Integer, Turma>();
	GeraCodigo gerarCodigo = new GeraCodigo();

	public Turma cadastrarTurma(Turma turma) {
		if (StringUtils.isEmpty(turma) && hashTurma.containsKey(turma.getCodigo()))
			throw new IllegalArgumentException();
		turma.setCodigo(gerarCodigo.gerarCodigo(turma));
		hashTurma.put(turma.getCodigo(), turma);
		return turma;
	}

	public void removerTurma(Turma turma) {
		if (StringUtils.isEmpty(turma))
			throw new IllegalArgumentException();
		hashTurma.remove(turma.getCodigo());

	}

	public Turma atualizarTurma(Turma turma) {
		if (turma == null || turma.getCodigo() == 0)
			throw new IllegalArgumentException();
		removerTurma(turma);
		cadastrarTurma(turma);
		return turma;
	}

	public Turma recuperarTurma(Turma turma) {
		if (StringUtils.isEmpty(turma) || StringUtils.isEmpty(turma.getCodigo()))
			throw new IllegalArgumentException();
		return hashTurma.get(turma.getCodigo());

	}

}
