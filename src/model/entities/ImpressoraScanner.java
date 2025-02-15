package model.entities;

import model.services.Printer;
import model.services.Scanner;

public class ImpressoraScanner extends Dispositivo implements Scanner, Printer{
	
	public ImpressoraScanner(String numeroSerial) {
		super(numeroSerial);
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo impressora: " + doc);
	}

	@Override
	public String scan() {
		return "Combo scan resultado";
	}

	@Override
	public void processaDoc(String doc) {
		System.out.println("Combo processamento: " + doc);
	}
}
