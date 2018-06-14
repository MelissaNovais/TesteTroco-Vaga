import java.util.Scanner;


public class Principal {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double valorTotal = 0;
		double valorPago = 0;
		
		Caixa caixa = new Caixa();

		System.out.println("Insira o valor total da compra");
		//Testa valor v�lido
		do {
			try {
				valorTotal = ler.nextDouble();
				if(valorTotal <=0)
					System.out.println("Esse total n�o � v�lido");
			} catch (Exception e) {
				System.out.println("Esse total n�o � v�lido");
				ler.nextLine();
			}
		 }while (valorTotal <=0);
		
		System.out.println("Insira o valor pago");
		//Testa Pagamento V�lido
		do {
			try {
				valorPago = ler.nextDouble();
				if(valorPago <= 0)
					System.out.println("Esse pagamento n�o � v�lido");
			} catch (Exception e) {
				System.out.println("Esse pagamento n�o � v�lido");
				ler.nextLine();
			}
		}while (valorPago <= 0);
		 
		System.out.println(caixa.calculaNotasMoedasTroco(valorPago, valorTotal)); 
	}

}

