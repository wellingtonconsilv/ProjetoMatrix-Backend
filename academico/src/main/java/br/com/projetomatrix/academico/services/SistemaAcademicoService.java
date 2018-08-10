package br.com.projetomatrix.academico.services;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.projetomatrix.academico.enumeracoes.StatusAcademico;
import br.com.projetomatrix.academico.models.Aluno;
import br.com.projetomatrix.academico.models.Avaliacao;
import br.com.projetomatrix.academico.models.Boletim;
import br.com.projetomatrix.academico.models.Coordenador;
import br.com.projetomatrix.academico.models.Curso;
import br.com.projetomatrix.academico.models.Disciplina;
import br.com.projetomatrix.academico.models.Historico;
import br.com.projetomatrix.academico.models.Horario;
import br.com.projetomatrix.academico.models.Professor;
import br.com.projetomatrix.academico.models.Turma;

public class SistemaAcademicoService {
	AlunoService alunoService = new AlunoService();
	CoordenadorService coordenadorService = new CoordenadorService();
	AvaliacaoService avaliacaoService = new AvaliacaoService();
	CursoService cursoService = new CursoService();
	DisciplinaService disciplinaService = new DisciplinaService();
	HorarioService horarioService = new HorarioService();
	ProfessorService professorService = new ProfessorService();
	TurmaService turmaService = new TurmaService();
	BoletimService boletimService = new BoletimService();
	HistoricoService historicoService = new HistoricoService();

	/*
	 *  Métodos Aluno
	 */
	
	public Aluno cadastrarAluno(Aluno aluno) {

		return alunoService.cadastrarAluno(aluno);
	}

	public void removerAluno(String matricula) {

		alunoService.removerAluno(matricula);
	}

	public Aluno recuperarAluno(String matricula) {

		return alunoService.recuperarAluno(matricula);
	}

	public Aluno atualizarAluno(Aluno aluno) {

		return alunoService.atualizarAluno(aluno);
	}
	
	public StatusAcademico buscarStatusAcademicoAluno(Aluno aluno) {
		return boletimService.getStatusAcademico(aluno);
	}
	
	public BigDecimal buscarMediaAluno(Aluno aluno) {
		return boletimService.gerarMedia(aluno);
	}
	
	public StatusAcademico statusAcademicoAluno(Aluno aluno) {
		
		return  boletimService.getStatusAcademico(aluno);
	}

	/*
	 *  Métodos Avaliação
	 */
	
	public Avaliacao cadastrarAvaliacao(Avaliacao avaliacao, Aluno aluno) {
		return avaliacaoService.cadastrarAvaliacao(avaliacao, aluno);
	}
	
	public Avaliacao cadastrarAvaliacao(Avaliacao avaliacao) {
		return avaliacaoService.cadastrarAvaliacao(avaliacao);
	}
	
	public void removerAvaliacao(Avaliacao avaliacao) {
		avaliacaoService.removerAvaliacao(avaliacao);
	}
		
	public Avaliacao atualizarAvaliacao(Avaliacao avaliacao) {
		return avaliacaoService.atualizarAvaliacao(avaliacao);
	}
		
	public Avaliacao recuperarAvaliacao(Avaliacao avaliacao) {
		return avaliacaoService.recuperarAvaliacao(avaliacao);
	}
	
	/*
	 *  Métodos Boletim
	 */
	
	public Boletim gerarBoletim(Aluno aluno, Turma turma) {
		return boletimService.gerarBoletim(aluno, turma);
	}
	
	/*
	 *  Méttodos Coordenador
	 */
	
	public Coordenador cadastrarCoordenador(Coordenador coordenador) {
		return coordenadorService.cadastrarCoordenador(coordenador);
	}
	
	public void removerCoordenador(String matricula) {
		coordenadorService.recuperarCoordenador(matricula);
	}
	
	public Coordenador atualizarCoordenador(Coordenador coordenador) {
		return coordenadorService.atualizarCoordenador(coordenador);
	}
	
	public Coordenador recuperarCoordenador(String matricula) {
		return coordenadorService.recuperarCoordenador(matricula);
	}
	
	/*
	 * Métodos Curso 
	 */
	
	public Curso cadastrarCurso(Curso curso) {
		return cursoService.cadastrarCurso(curso);
	}
	
	public void removerCurso(Curso curso) {
		cursoService.removerCurso(curso);
	}
	
	public Curso atualizarCurso(Curso curso) {
		return cursoService.atualizarCurso(curso);
	}
	
	public Curso recuperarCurso(Curso curso) {
		return cursoService.recuperarCurso(curso);
	}
	
	/*
	 * Métodos Disciplina
	 */
		
	public Disciplina cadastrarDisciplina(Disciplina disciplina, Curso curso, List<Professor> professores){
		return disciplinaService.cadastrarDisciplina(disciplina, curso, professores);
	}
	
	public void removerDisciplina(Disciplina disciplina) {
		disciplinaService.removerDisciplina(disciplina);
	}
	
	public Disciplina atualizarDisciplina(Disciplina disciplina, Curso curso, List<Professor> professores){
		return disciplinaService.atualizarDisciplina(disciplina, curso, professores);
	}
	
	public Disciplina recuperarDisciplina(Disciplina disciplina) {
		return disciplinaService.recuperarDisciplina(disciplina);
	}
	
	/*
	 * Métodos Historico
	 */
	
	public Historico gerarHistorico(Aluno aluno, List<Boletim> boletim) {
		return historicoService.gerarHistorico(aluno, boletim);
	}
	
	/*
	 * Métodos Horário
	 */
	
	public Horario cadastrarHorario(Horario horario) {
		return horarioService.cadastrarHorario(horario);
	}
	
	public void removerHorario(Horario horario){
		horarioService.removerHorario(horario);;
	}
	
	public Horario atualizarHorario(Horario horario) {
		return horarioService.atualizarHorario(horario);
	}
	
	public Horario recuperarHorario(Horario horario) {
		return horarioService.recuperarHorario(horario);
	}
	
	/*
	 * Métodos Professor
	 */
	
	public Professor cadastrarProfessor(Professor professor) {
		return professorService.cadastrarProfessor(professor);
	}
	
	public void removerProfessor(String matricula) {
		professorService.removerProfessor(matricula);
	}
	
	public Professor atualizarProfessor(Professor professor) {
		return professorService.atualizarProfessor(professor);
	}
	
	public Professor recuperarProfessor(String matricula) {
		return professorService.recuperarProfessor(matricula);
	}
	
	/*
	 * Métodos Turma
	 */
	
	public Turma cadastrarTurma(Turma turma) {
		return turmaService.cadastrarTurma(turma);
	}
	
	public void removerTurma(Turma turma) {
		turmaService.removerTurma(turma);
	}
	
	public Turma atualizarTurma(Turma turma) {
		return turmaService.atualizarTurma(turma);
	}
	
	public Turma recuperarTurma(Turma turma) {
		return turmaService.recuperarTurma(turma);
	}
}
