package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
	A_DESEJAR {
		@Override
		public BigDecimal perecentualReajuste() {
		
			
			return null;
		}
	}, Bom {
		@Override
		public BigDecimal perecentualReajuste() {
			
			
			return null;
		}
	}, Otimo {
		@Override
		public BigDecimal perecentualReajuste() {

			
			
			return null;
		}
	};

	
	public abstract BigDecimal perecentualReajuste() {
		
	}
}
