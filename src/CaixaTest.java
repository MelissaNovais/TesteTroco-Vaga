import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CaixaTest {

	@Test
	public void main () {
		Caixa cx = new Caixa();
		String resultadoEsperado = "0 Notas de 100.0\n" + 
				"0 Notas de 50.0\n" + 
				"4 Notas de 10.0\n" + 
				"1 Notas de 5.0\n" + 
				"4 Notas de 1.0\n" + 
				"0 Moedas de 0.5\n" + 
				"1 Moedas de 0.1\n" + 
				"0 Moedas de 0.05\n" + 
				"0 Moedas de 0.01\n";
		assertEquals(resultadoEsperado, cx.calculaNotasMoedasTroco(200, 150.90));	
		resultadoEsperado = "0 Notas de 100.0\n" + 
				"0 Notas de 50.0\n" + 
				"4 Notas de 10.0\n" + 
				"1 Notas de 5.0\n" + 
				"4 Notas de 1.0\n" + 
				"0 Moedas de 0.5\n" + 
				"0 Moedas de 0.1\n" + 
				"0 Moedas de 0.05\n" + 
				"1 Moedas de 0.01\n";
		assertEquals(resultadoEsperado, cx.calculaNotasMoedasTroco(600, 550.99));
		
		resultadoEsperado = "0 Notas de 100.0\n" + 
				"0 Notas de 50.0\n" + 
				"2 Notas de 10.0\n" + 
				"0 Notas de 5.0\n" + 
				"1 Notas de 1.0\n" + 
				"0 Moedas de 0.5\n" + 
				"3 Moedas de 0.1\n" + 
				"1 Moedas de 0.05\n" + 
				"3 Moedas de 0.01\n";
		assertEquals(resultadoEsperado, cx.calculaNotasMoedasTroco(100, 78.62));
		
		resultadoEsperado = cx.alerta;
		assertEquals(resultadoEsperado, cx.calculaNotasMoedasTroco(0.0, 0.0));
	}

}
