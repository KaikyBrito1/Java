package com.mycompany.calculadoraimc;

public class Main {
    public static void main(String[] args) {
        DadosEntradaIMC entrada = new DadosEntradaIMC();
        DadosSaidaIMC saida = new DadosSaidaIMC();
        CalcularIMC calculadora = new CalcularIMC();

        entrada.setPeso(70.0);
        entrada.setAltura(1.75);

        calculadora.calcular(entrada, saida);

        System.out.println("IMC calculado: " + saida.getResultadoImc());
    }
}