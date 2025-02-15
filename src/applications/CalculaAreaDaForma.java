/*Fazer um programa para ler os dados de N figuras (N fornecido pelo usuário), e depois mostrar as áreas destas figuras na
mesma ordem em que foram digitadas.

Entities - Forma, Circulo, Retangulo
Entities.Enums - Cor
*/

package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Circulo;
import model.entities.FormaAbastrata;
import model.entities.Retangulo;
import model.entities.Cor.Cor;
import model.services.Forma;

public class CalculaAreaDaForma {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<FormaAbastrata> list = new ArrayList<>();
		
		System.out.print("Entre com o Número de Formas: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Forma #" + i + ":");
			
			System.out.print("Retangulo or Circulo (r/c)? ");
			char forma = sc.next().charAt(0);
			
			System.out.print("Cor (Preto/Azul/Vermelho): ");
			Cor cor = Cor.valueOf(sc.next().toUpperCase());
			
			if (forma == 'r') {
				System.out.print("Largula: ");
				double largura = sc.nextDouble();
				
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				
				list.add(new Retangulo(cor, largura, altura));
			}
			else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				list.add(new Circulo(cor, raio));
			}
		}
		
		System.out.println();
		System.out.println("Area das Formas");
		for (FormaAbastrata forma : list) {
			System.out.println(String.format("%.2f", forma.area()));
		}
		
		sc.close();

	}

}
