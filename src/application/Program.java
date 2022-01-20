package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um ano: ");
		int ano = sc.nextInt();
		int seculo;

		if (ano % 100 == 0) {
			seculo = ano / 100;
		} else {
			seculo = ano / 100 + 1;
		}

		System.out.println("O ano digitado pertence ao século " + seculo);
		sc.close();
	}
}
