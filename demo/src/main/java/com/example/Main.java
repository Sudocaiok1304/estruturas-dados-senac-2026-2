package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AnaliseComplexidade analise = new AnaliseComplexidade();
        analise.tempoConstante(new int[]{1, 2, 3, 4, 5});
        analise.tempoLogaritmico(AnaliseComplexidade.getN());
        analise.tempoLinear(5);
        analise.tempoQuadratico(3);
        analise.tempoQuadratico(3);
    }
}