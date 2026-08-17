package com.mycompany.calculadoraimc;

public class CalcularIMC {

    public void calcular(DadosEntradaIMC entrada, DadosSaidaIMC saida) {
        double peso = entrada.getPeso();
        double altura = entrada.getAltura();
        double imc = peso / (altura * altura);
        
        saida.setResultadoImc(imc);
    }
}