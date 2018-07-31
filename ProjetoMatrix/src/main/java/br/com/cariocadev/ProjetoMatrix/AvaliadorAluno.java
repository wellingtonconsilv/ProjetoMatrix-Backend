package br.com.cariocadev.ProjetoMatrix;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.math.BigDecimal;

public class AvaliadorAluno {

	public BigDecimal getMaiorNota(BigDecimal[] notas) {
		
		if(notas != null) {
			
		 List<BigDecimal> maiorNotaAluno = Arrays.asList(notas);
		 Collections.sort(maiorNotaAluno, Collections.reverseOrder());
		 
		 return maiorNotaAluno.get(0);
		 
		}else {
			throw new IllegalArgumentException();
		}
		 
	}

	public BigDecimal getMedia(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
				
		if(validarNota(nota1) && validarNota(nota2) && validarNota(nota3)) {
		
			BigDecimal media = nota1.add(nota2).add(nota3).divide(BigDecimal.valueOf(3), 2, BigDecimal.ROUND_HALF_UP);
			
	        return media.setScale(2);
		 }else {
			 throw new IllegalArgumentException();
	     }
        
	}

	public String getStatus(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {

	            BigDecimal media = getMedia(nota1, nota2, nota3);

	            if (media.compareTo(BigDecimal.valueOf(6)) >= 0) {
	                return "APROVADO";
	            }else if (media.compareTo(BigDecimal.valueOf(4)) >= 0 && media.compareTo(BigDecimal.valueOf(6)) < 0) {
	                return "PROVA_FINAL";
	            }else {
	                return "REPROVADO";
	            }
	}
	
	public boolean validarNota(BigDecimal nota) {		
		
		return nota!=null && nota.compareTo(BigDecimal.ZERO) >= 0 && nota.compareTo(BigDecimal.TEN) <= 0;
		
	}

}