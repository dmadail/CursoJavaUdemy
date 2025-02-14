package model.services;

public interface PagamentoOnlineService {
	double taxaPagamento(Double valor);
	double juros(Double valor, Integer mes);
}
