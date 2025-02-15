package applications;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Funcionario;

public class LerEOrdenarCSV {

	public static void main(String[] args) {

		List<Funcionario> funcionarios = new ArrayList<>();
		String path = "C:\\Danielle-Projetos\\ws-eclipse\\exercicios_servicos_interfaces\\funcionarios.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String funcionarioCsv = br.readLine();
			while (funcionarioCsv != null) {
				String[] fields = funcionarioCsv.split(",");
				funcionarios.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
				funcionarioCsv = br.readLine();
			}
			
			Collections.sort(funcionarios);
			for (Funcionario funcionario : funcionarios) {
				System.out.println(funcionario.getNome() + ", " + funcionario.getSalario());
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
