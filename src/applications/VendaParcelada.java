package applications;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcelamento;
import model.services.ContratoService;
import model.services.PaypalService;

public class VendaParcelada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os Dados do Contrato");
		
		System.out.print("Número: ");
		Integer numero = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Data (DD/MM/AAAA): ");
		LocalDate inicio = LocalDate.parse(sc.nextLine(), fmt);
		
		System.out.print("Valor: ");
		Double valor = sc.nextDouble();
		
		System.out.print("Entre com o numero de parcelas: ");
		Integer qtdParcelas = sc.nextInt();
		
		Contrato contrato = new Contrato(numero, inicio, valor);
		ContratoService contratoService = new ContratoService(new PaypalService());
		
		contratoService.processoContrato(contrato, qtdParcelas);
		
		System.out.println();
		System.out.println("Parcelas:");
		
		for (int i = 0; i < qtdParcelas; i++) {
			System.out.print(contrato.getParcelamento().get(i).getDataVencimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			System.out.println(" - " + String.format("%.2f",contrato.getParcelamento().get(i).getValor()));
		}
		

	}

}
