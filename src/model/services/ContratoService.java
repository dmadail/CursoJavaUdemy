package model.services;

import java.time.LocalDate;

import model.entities.Contrato;
import model.entities.Parcelamento;

public class ContratoService {
	
	private PagamentoOnlineService pagamentoOnlineService;
	
		
	public ContratoService(PagamentoOnlineService pagamentoOnlineService) {
		this.pagamentoOnlineService = pagamentoOnlineService;
	}

	public void processoContrato(Contrato contrato, Integer qtdParcelas) {
		
		for (int i = 1; i <= qtdParcelas; i++) {
			LocalDate dataVencimento = contrato.getData().plusMonths(i);
			Double valorParcela = contrato.getValorTotal() / qtdParcelas;
			
			valorParcela += pagamentoOnlineService.juros(valorParcela, i);
			valorParcela += pagamentoOnlineService.taxaPagamento(valorParcela);
			
			contrato.getParcelamento().add(new Parcelamento (dataVencimento, valorParcela));
			
		}
		
	}
}
