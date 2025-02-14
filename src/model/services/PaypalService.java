package model.services;

public class PaypalService implements PagamentoOnlineService{

	@Override
	public double taxaPagamento(Double valor) {
		valor = valor * 0.02;
		return valor;
	}

	@Override
	public double juros(Double valor, Integer mes) {
		valor = valor * mes / 100;
		return valor;
	}

}
