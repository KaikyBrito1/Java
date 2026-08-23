package com.mycompany.geometriadoretangulo;

public class GeometriaDoRetangulo {

    public static void main(String[] args) {
        DadosEntradaRetangulo de = new DadosEntradaRetangulo();
        de.setBase(5.0);
        de.setAltura(3.0);
        
        CalculadoraRetangulo calculadora = new CalculadoraRetangulo();
        
        DadosSaidaRetangulo resultado = calculadora.calcularArea(de);
        System.out.println("Area: "+ resultado.getArea());
        
        calculadora.calcularPerimetro(de);
        System.out.println("Perimetro: "+ resultado.getPerimetro());
        
        
    }
}
