package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
	
	private Integer numero;
	private LocalDate data;
	private Double valorTotal;
	
	private List<Parcelamento> parcelamentos = new ArrayList<>();
	
	public Contrato(){
		
	}
	
	public Contrato(Integer numero, LocalDate data, Double valorTotal) {
		super();
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public List<Parcelamento> getParcelamento() {
		return parcelamentos;
	}

	public Double getValorTotal() {
		return valorTotal;
	}
	
	
	
}

