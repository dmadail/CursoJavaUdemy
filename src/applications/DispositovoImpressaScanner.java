package applications;

import model.entities.ImpressoraScanner;

public class DispositovoImpressaScanner {

	public static void main(String[] args) {
		
		ImpressoraScanner c = new ImpressoraScanner("2081");
		c.processaDoc("Meu processamento");
		c.print("Minha Impressao");
		System.out.println("Scan resultado: " + c.scan());

	}

}
