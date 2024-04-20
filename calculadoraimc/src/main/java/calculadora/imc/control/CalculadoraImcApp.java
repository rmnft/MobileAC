package imc;

import java.util.Scanner;

public class CalculadoraImcApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de IMC");
        System.out.print("Digite a altura (m): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o sexo (masculino/feminino): ");
        String sexo = scanner.next();

        CalculadoraImc calculadora = new CalculadoraImc();
        String resultado = calculadora.calcularImc(altura, peso, idade, sexo);

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
