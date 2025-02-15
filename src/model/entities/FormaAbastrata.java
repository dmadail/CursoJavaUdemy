package model.entities;

import model.enums.Cor;
import model.services.Forma;

public abstract class FormaAbastrata implements Forma {
	private Cor cor;
	
	public FormaAbastrata() {
	}
	
	public FormaAbastrata(Cor cor) {
		this.cor = cor;
	}

	public Cor getColor() {
		return cor;
	}

	public void setColor(Cor cor) {
		this.cor = cor;
	}
	
	
}
