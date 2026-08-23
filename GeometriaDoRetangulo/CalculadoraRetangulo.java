package com.mycompany.geometriadoretangulo;

public class CalculadoraRetangulo {
    private DadosSaidaRetangulo ds = new DadosSaidaRetangulo();
    
    public DadosSaidaRetangulo calcularArea(DadosEntradaRetangulo de){
        double areaCalculada = de.getBase() * de.getAltura();
        ds.setArea(areaCalculada);
        return ds;
    }
    
    public DadosSaidaRetangulo calcularPerimetro(DadosEntradaRetangulo de){
        double perimetroCalculado = 2 * (de.getBase() + de.getAltura());
        ds.setPerimetro(perimetroCalculado);
        return ds;
    }
}
