package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

public class AvaliadorAluno {

	public BigDecimal getMaiorNota(BigDecimal[] notas) {
		
		 BigDecimal maior = new BigDecimal("0");
		 
		 if(notas != null) {
			 for (BigDecimal nota: notas){
				 if(nota.compareTo(maior)==1){
		    		 maior = nota;
		         }
		     }
		     return maior.setScale(2);
		 }else {
			  throw new IllegalArgumentException();
		 }
		 
	}

	public BigDecimal getMedia(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
		
		BigDecimal media = new BigDecimal("0");
		
		if((nota1!=null && nota2!=null && nota3 != null) &&
          (nota1.compareTo(new BigDecimal("0"))>0 && nota2.compareTo(new BigDecimal(0))>0 && nota3.compareTo(new BigDecimal(0))>0) &&
          (nota1.compareTo(new BigDecimal("10"))<=0 && nota2.compareTo(new BigDecimal("10"))<=0 && nota3.compareTo(new BigDecimal("10"))<=0)) {
		
			media = nota1.add(nota2).add(nota3).divide(new BigDecimal (3), 2, BigDecimal.ROUND_HALF_UP);
	
	        return media.setScale(2);
		 }else {
			 throw new IllegalArgumentException();
	     }
        
	}

	public String getStatus(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
		  BigDecimal media = new BigDecimal("0");
	        if((nota1!=null && nota2!=null && nota3 != null) &&
	          (nota1.compareTo(new BigDecimal("0"))>0 && nota2.compareTo(new BigDecimal(0))>0 && nota3.compareTo(new BigDecimal(0))>0) &&
	          (nota1.compareTo(new BigDecimal("10"))<=0 && nota2.compareTo(new BigDecimal("10"))<=0 && nota3.compareTo(new BigDecimal("10"))<=0)) {

	            media = getMedia(nota1, nota2, nota3);

	            if (media.compareTo(new BigDecimal("6")) >= 0) {
	                return "APROVADO";
	            }else if (media.compareTo(new BigDecimal("4")) >= 0 && media.compareTo(new BigDecimal("6")) < 0) {
	                return "PROVA_FINAL";
	            }else {
	                return "REPROVADO";
	            }
	        }else {
	            throw new IllegalArgumentException();
	        }
	}

}


