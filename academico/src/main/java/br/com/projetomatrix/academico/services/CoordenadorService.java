package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.Coordenador;
import br.com.projetomatrix.academico.GeraMatricula;

public class CoordenadorService {
	Map<String, Coordenador> hashCoordenador = new HashMap<String, Coordenador>();
	GeraMatricula gerar = new GeraMatricula();

	public Map<String, Coordenador> getHashCoordenador() {
		return hashCoordenador;
	}

	public void setHashAluno(Map<String, Coordenador> hashCoordenador) {
		this.hashCoordenador = hashCoordenador;
	}

	public Coordenador cadastrarCoordenador(Coordenador coordenador) {
		if (coordenador == null || hashCoordenador.containsKey(coordenador.getMatricula().length() == 0))
			throw new IllegalArgumentException();
		coordenador.setMatricula(gerar.gerarMatricula(coordenador));
		hashCoordenador.put(coordenador.getMatricula(), coordenador);
		return coordenador;
	}

	public void removerCoordenador(String matricula) {
		if (matricula == null || matricula.length() == 0)
			throw new IllegalArgumentException();

		hashCoordenador.remove(matricula);

	}

	public Coordenador atualizarCoordenador(Coordenador coordenador) {
		if (coordenador == null || coordenador.getMatricula().length() == 0)
			throw new IllegalArgumentException();

		removerCoordenador(coordenador.getMatricula());
		cadastrarCoordenador(coordenador);
		return coordenador;
	}

	public Coordenador recuperarCoordenador(String matricula) {
		if (matricula == null || matricula.length() == 0)
			throw new IllegalArgumentException();
		return hashCoordenador.get(matricula);
	}
}