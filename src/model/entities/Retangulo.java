package model.entities;

import model.enums.Cor;

public class Retangulo extends FormaAbastrata{
	private Double largura;
	private Double altura;
	
	public Retangulo() {
		super();
	}

	public Retangulo(Cor cor, Double largura, Double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}

	public Double Largura() {
		return largura;
	}

	public void setWidth(Double width) {
		this.largura = width;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return largura * altura;
	}
}
