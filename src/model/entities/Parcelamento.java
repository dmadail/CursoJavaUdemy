package model.entities;

import java.time.LocalDate;

public class Parcelamento {
	private LocalDate dataVencimento;
	private Double valor;
	
	public Parcelamento() {
		
	}
	
	public Parcelamento(LocalDate dataVencimento, Double valor) {
		this.dataVencimento = dataVencimento;
		this.valor = valor;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
}	
