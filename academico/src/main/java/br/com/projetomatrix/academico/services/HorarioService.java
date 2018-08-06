package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.GeraCodigo;
import br.com.projetomatrix.academico.curso.Horario;



public class HorarioService {
	Map<Integer, Horario> hashHorario = new HashMap<Integer, Horario>();
	GeraCodigo gerarCodigo = new GeraCodigo();

	public Horario cadastrarHorario(Horario horario) {
		if (horario == null && hashHorario.containsKey(horario.getCodigo() == 0))
			throw new IllegalArgumentException();

		hashHorario.put(gerarCodigo.gerarCodigo(horario), horario);
		return horario;
	}

	public void removerHorario(Horario horario) {
		if (horario == null)
			throw new IllegalArgumentException();
		hashHorario.remove(horario.getCodigo());

	}

	public Horario atualizarHorario(Horario horario) {
		if (horario == null || horario.getCodigo() == 0)
			throw new IllegalArgumentException();
		removerHorario(horario);
		cadastrarHorario(horario);
		return horario;
	}

	public Horario recuperarHorario(Horario horario) {
		if (horario == null || horario.getCodigo() == 0)
			throw new IllegalArgumentException();

		return hashHorario.get(horario.getCodigo());

	}

}
