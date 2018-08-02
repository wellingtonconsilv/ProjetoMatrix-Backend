package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

public class CalculadoraSalario {

	public BigDecimal getSalarioLiquido(BigDecimal salarioBruto, BigDecimal percentualImpostoINSS) {
		BigDecimal salarioLiquido = new BigDecimal("0");
		if(salarioBruto != null && salarioBruto.compareTo(BigDecimal.ZERO) > 0) {
			salarioLiquido = salarioBruto.subtract(salarioBruto.multiply(percentualImpostoINSS).divide(new BigDecimal("100"), 2, BigDecimal.ROUND_HALF_UP));
			return salarioLiquido;
		}else {
			throw new IllegalArgumentException();
		}
		
		
	}

	public BigDecimal getValorINSS(BigDecimal salarioBruto) {
		
		BigDecimal inss = new BigDecimal("0");
		if(salarioBruto != null) {
			if (salarioBruto.compareTo(new BigDecimal("1693.72"))<=0) {
				inss = salarioBruto.multiply(new BigDecimal("8")).divide(new BigDecimal("100"), 2, BigDecimal.ROUND_HALF_UP);
				
			}else if(salarioBruto.compareTo(new BigDecimal("1693.73"))>=0 && salarioBruto.compareTo(new BigDecimal("2822.90"))<=0) {
				inss = salarioBruto.multiply(new BigDecimal("9")).divide(new BigDecimal("100"), 2, BigDecimal.ROUND_HALF_UP);
				
			}else if(salarioBruto.compareTo(new BigDecimal("2822.91"))>=0) {
				inss = salarioBruto.multiply(new BigDecimal("11")).divide(new BigDecimal("100"), 2, BigDecimal.ROUND_HALF_UP);
			}
			
			return inss;
		}else {
			throw new IllegalArgumentException();
		}
		
	}

	public BigDecimal getValorPlanoDeSaude(Integer idade) {
		
		if(idade != null && idade >= 0) {
			if(idade>=0 && idade<=9) {
				return new BigDecimal("75").setScale(2);
				
			}else if(idade >= 10 && idade <= 19) {
				return new BigDecimal("112.50").setScale(2);
				
			}else if(idade >= 20 && idade <= 29) {
				return new BigDecimal("168.75").setScale(2);
				
			}else if(idade >= 30 && idade <= 39) {
				return new BigDecimal("253.13").setScale(2);
				
			}else if(idade >= 40 && idade <= 49) {
				return new BigDecimal("379.69").setScale(2);
				
			}else if(idade>= 50 && idade <= 59) {
				return new BigDecimal("569.54").setScale(2); 
				
			}else {
				return new BigDecimal("854.30").setScale(2);
			}
		}else {
			throw new IllegalArgumentException();
		}
	}

}
