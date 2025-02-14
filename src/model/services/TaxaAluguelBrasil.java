package model.services;

public class TaxaAluguelBrasil implements TaxService{
	
	public double taxa(double valor) {
		if (valor <= 100.0) {
			return valor * 0.2;
		}
		else {
			return valor * 0.15;
		}
	}
}
