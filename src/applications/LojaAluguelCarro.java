package applications;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.services.ServicosDeAluguel;
import model.services.TaxaAluguelBrasil;

public class LojaAluguelCarro {

	
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String modeloCarro = sc.nextLine();
		System.out.print("Retirada (DD/MM/AAAA HH:MM): ");
		LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (DD/MM/AAAA HH:MM): ");
		LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), fmt);
		
		AluguelCarro cr = new AluguelCarro(inicio, fim, new Veiculo(modeloCarro));

		System.out.print("Entre com o preço por hora: ");
		double precoPorHora = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double precoPorDia = sc.nextDouble();
		
		ServicosDeAluguel servicoDeAluguel = new ServicosDeAluguel(precoPorDia, precoPorHora, new TaxaAluguelBrasil());
		
		servicoDeAluguel.processaFatura(cr);
		
		System.out.println();
		System.out.println("FATURA:");
		System.out.println("Pagamento Básico: " + String.format("%.2f", cr.getFatura().getPagamentoBase()));
		System.out.println("Imposto: " + String.format("%.2f", cr.getFatura().getTaxa()));
		System.out.println("Pagamento Total: " + String.format("%.2f", cr.getFatura().getTotalPayment()));
		
		sc.close();
	}


}
