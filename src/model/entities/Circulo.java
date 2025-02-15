package model.entities;

import model.entities.Cor.Cor;

public class Circulo extends FormaAbastrata{
	
	private Double raio;
	
	public Circulo() {
		super();
	}
	
	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRadius() {
		return raio;
	}

	public void setRadius(Double radius) {
		this.raio = radius;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
}
