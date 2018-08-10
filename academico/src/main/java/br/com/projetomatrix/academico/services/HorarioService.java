package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import br.com.projetomatrix.academico.models.GeraCodigo;
import br.com.projetomatrix.academico.models.Horario;



public class HorarioService {
	Map<Integer, Horario> hashHorario = new HashMap<Integer, Horario>();
	GeraCodigo gerarCodigo = new GeraCodigo();

	public Horario cadastrarHorario(Horario horario) {
		if (ObjectUtils.isEmpty(horario) || hashHorario.containsKey(horario.getCodigo()))
			throw new IllegalArgumentException();

		horario.setCodigo(gerarCodigo.gerarCodigo(horario));
		hashHorario.put(horario.getCodigo(), horario);
		return horario;
	}

	public void removerHorario(Horario horario) {
		if (ObjectUtils.isEmpty(horario))
			throw new IllegalArgumentException();
		hashHorario.remove(horario.getCodigo());

	}

	public Horario atualizarHorario(Horario horario) {
		if (ObjectUtils.isEmpty(horario) || ObjectUtils.isEmpty(horario.getCodigo()))
			throw new IllegalArgumentException();
		removerHorario(horario);
		cadastrarHorario(horario);
		return horario;
	}

	public Horario recuperarHorario(Horario horario) {
		if (ObjectUtils.isEmpty(horario) || ObjectUtils.isEmpty(horario.getCodigo()))
			throw new IllegalArgumentException();

		return hashHorario.get(horario.getCodigo());

	}

}
