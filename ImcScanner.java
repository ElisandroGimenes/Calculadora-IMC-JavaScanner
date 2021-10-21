package br.com.alura.loja;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ImcScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();

		System.out.println("Digite sua altura usando vírgula: ");
		float altura = scanner.nextFloat();

		System.out.println("Digite seu peso: ");
		int peso = scanner.nextInt();

		System.out.println("Nome: " + nome + ".");
		System.out.println("Altura: " + altura + " metros.");
		System.out.println("Peso: " + peso + " Quilogramas.");
		float IMC = peso / (altura * altura);
		DecimalFormat deci = new DecimalFormat();
		deci.applyPattern("0.00");
		System.out.println("IMC: " + deci.format(IMC));

		if (IMC < 16.9) {
			System.out.println("Resultado: Muito abaixo do peso.");
		} else if (IMC > 17 && IMC < 18.4) {
			System.out.println("Resultado: Abaixo do peso.");
		} else if (IMC > 18.5 && IMC < 24.9) {
			System.out.println("Resultado: Peso normal.");
		} else if (IMC > 25 && IMC < 29.9) {
			System.out.println("Resultado: Acima do peso.");
		} else if (IMC > 30 && IMC < 34.9) {
			System.out.println("Resultado: Obesidade Grau I.");
		} else if (IMC > 35 && IMC < 40) {
			System.out.println("Resultado: Obesidade Grau II.");
		} else if (IMC > 40) {
			System.out.println("Resultado: Obesidade Grau III.");
		}
	}
}
