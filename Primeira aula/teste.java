
package com.poo.prj__poo1_aula270726;

public class Teste {
    public void mostrar ()
    {
        System.out.println("Ola Mundo!!!");
    }
    
    public void somar(){
        int nro1 = 5;
        int nro2 = 4;
        
        int resultado = nro1 + nro2;
        
        System.out.println(resultado);
    }
    
    public int somar(String nro1, String nro2)
    {
        int resultado = Integer.parseInt(nro1) + Integer.parseInt(nro2);
        
        System.out.println(resultado);
        
        return resultado;
    }
    public void mostrarValor(int valor)
    {
        System.out.println("O valor encontrado eh: "+ valor);
    }
}
