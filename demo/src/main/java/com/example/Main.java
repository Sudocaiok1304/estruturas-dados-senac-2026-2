package com.example;

public class Main {
    public static void main(String[] args) {
        AnaliseComplexidade analise = new AnaliseComplexidade();
        analise.demonstrarTodos();

        new DeclaracaoVetores().demonstrarTodos();
        new PercorrerVetores().demonstrarTodos();
        new TiposDeVetores().demonstrarTodos();
        new RegrasVetores().demonstrarTodos();
        new ArrayPratico().executar();
    }
}
