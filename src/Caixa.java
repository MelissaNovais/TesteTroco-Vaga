import java.text.DecimalFormat;
import java.util.ArrayList;

public class Caixa {

	ArrayList<Double> notas = new ArrayList<Double>();
	ArrayList<Double> moedas = new ArrayList<Double>();
	public final String alerta = "Não há notas disponíveis para realizar este saque";
	public String resultado;
	double troco = 0;
	
	public Caixa() {

		notas.add(100.0);
		notas.add(50.0);
		notas.add(10.0);
		notas.add(5.0);
		notas.add(1.0);

		moedas.add(0.5);
		moedas.add(0.1);
		moedas.add(0.05);
		moedas.add(0.01);
	}

	public String calculaNotasMoedasTroco(double valorPago, double valorTotal) {
		troco = valorPago - valorTotal;
		resultado = "";
		int cont = 0; // Para contar qtde de moedas e cédulas

		troco = this.formatarDouble(troco);
		
		if (troco < 0)
			return alerta;
		else if (troco == 0)
			return alerta;

		else {
			for (Double nota : notas) { // ForEach para ver quais notas vao ser usadas
				cont = (int) (troco / nota);
				troco = troco - cont * nota;
				troco = this.formatarDouble(troco);//Para nao haver calculo errado devido a casas decimais em excesso
				resultado += cont + " Notas de " + nota + "\n";
			}

			for (Double moeda : moedas) { // ForEach para ver quais moedas vao ser usadas
				cont = 0;
				if (troco >= moeda) {
					while (troco >= moeda) {
						troco -= moeda;
						troco = this.formatarDouble(troco);
						cont++;
					}
				}
				resultado += cont + " Moedas de " + moeda + "\n";
			}
		}
		return resultado;
	}
	
	public double formatarDouble(double formatar) {
		DecimalFormat df = new DecimalFormat("###.##");// Para haver exatamente duas casas decimais
		String str = df.format(formatar);
		str = str.replaceAll(",", ".");
		return Double.parseDouble(str);
	}
}
