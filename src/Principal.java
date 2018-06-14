import java.util.Scanner;


public class Principal {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double valorTotal = 0;
		double valorPago = 0;
		
		Caixa caixa = new Caixa();

		System.out.println("Insira o valor total da compra");
		//Testa valor válido
		do {
			try {
				valorTotal = ler.nextDouble();
				if(valorTotal <=0)
					System.out.println("Esse total não é válido");
			} catch (Exception e) {
				System.out.println("Esse total não é válido");
				ler.nextLine();
			}
		 }while (valorTotal <=0);
		
		System.out.println("Insira o valor pago");
		//Testa Pagamento Válido
		do {
			try {
				valorPago = ler.nextDouble();
				if(valorPago <= 0)
					System.out.println("Esse pagamento não é válido");
			} catch (Exception e) {
				System.out.println("Esse pagamento não é válido");
				ler.nextLine();
			}
		}while (valorPago <= 0);
		 
		System.out.println(caixa.calculaNotasMoedasTroco(valorPago, valorTotal)); 
	}

}

