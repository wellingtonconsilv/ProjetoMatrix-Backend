package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.GeraCodigo;
import br.com.projetomatrix.academico.curso.Avaliacao;
import br.com.projetomatrix.academico.curso.Avaliacao;

public class AvaliacaoService {
	Map<Integer, Avaliacao> hashAvaliacao = new HashMap<Integer, Avaliacao>();
	GeraCodigo gerarCodigo = new GeraCodigo();

	public Avaliacao cadastarAvaliacao(Avaliacao avaliacao) {
		if (avaliacao == null && hashAvaliacao.containsKey(avaliacao.getCodigo() == 0))
			throw new IllegalArgumentException();

		hashAvaliacao.put(gerarCodigo.gerarCodigo(avaliacao), avaliacao);
		return avaliacao;
	}

	public void removerAvaliacao(Avaliacao avaliacao) {
		if (avaliacao == null)
			throw new IllegalArgumentException();
		hashAvaliacao.remove(avaliacao.getCodigo());

	}

	public Avaliacao atualizarAvaliacao(Avaliacao avaliacao) {
		if (avaliacao == null || avaliacao.getCodigo() == 0)
			throw new IllegalArgumentException();
		removerAvaliacao(avaliacao);
		cadastarAvaliacao(avaliacao);
		return avaliacao;
	}

	public Avaliacao recuperarAvaliacao(Avaliacao avaliacao) {
		if (avaliacao == null || avaliacao.getCodigo() == 0)
			throw new IllegalArgumentException();

		return hashAvaliacao.get(avaliacao.getCodigo());

	}
}
