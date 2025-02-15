package applications;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LerNomesMisturadosEOrdenar {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		String path = "C:\\Danielle-Projetos\\ws-eclipse\\exercicios_servicos_interfaces\\NomesMisturados.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String nome = br.readLine();
			
			while (nome != null) {
				lista.add(nome);
				nome = br.readLine();
			}
			
			Collections.sort(lista);
			for (String nomeOrdenado : lista) {
				System.out.println(nomeOrdenado);
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
