package model.services;

import java.time.Duration;

import model.entities.AluguelCarro;
import model.entities.Fatura;

public class ServicosDeAluguel {
	private Double precoPorDia;
	private Double precoPorHora;
	
	private TaxService taxaService;

	public ServicosDeAluguel(Double precoPorDia, Double precoPorHora, TaxService taxaService) {
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxaService = taxaService;
	}
	
	public void processaFatura(AluguelCarro aluguelCarro) {
		
		double minutes = Duration.between(aluguelCarro.getInicio(), aluguelCarro.getFim()).toMinutes();		
		double hours = minutes / 60.0;
		
		double pagamentoBase;
		if (hours <= 12.0) {
			pagamentoBase = precoPorHora * Math.ceil(hours);
		}
		else {
			pagamentoBase = precoPorDia * Math.ceil(hours / 24);
		}

		double taxa = taxaService.taxa(pagamentoBase);

		aluguelCarro.setFatura(new Fatura(pagamentoBase, taxa));
	}
}
