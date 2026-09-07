package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Estruturas de Dados ===");
        System.out.println("1 - Media de notas");
        System.out.println("2 - Soma de valores");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            new MediaNotas().calcularMedia();
        } else if (opcao == 2) {
            calcularSoma(5, 10, "Danilo");
            calcularSoma(2, 3, "Alice");
        } else {
            System.out.println("Opcao invalida.");
        }

        scanner.close();
    }

    public static void calcularSoma(int primeiroValor, int segundoValor, String nome) {
        System.out.println((primeiroValor + segundoValor) + " " + nome);
    }
}