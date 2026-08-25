package com.mycompany.prj_polimorfismoherancasobre_poo1;
import com.mycompany.prj_polimorfismoherancasobre_poo1.models.Pessoa;
import com.mycompany.prj_polimorfismoherancasobre_poo1.models.PessoaFisica;
import com.mycompany.prj_polimorfismoherancasobre_poo1.models.PessoaJuridica;

public class Prj_PolimorfismoHerancaSobre_Poo1 {

    public static void main(String[] args) {
        
        /* ExemploSobrecarga es1 = new ExemploSobrecarga();
        
        // ExemploSobrecarga es2 = new ExemploSobrecarga("Teste 1", "Teste 2");
        
        System.out.println("Resultado: " + es1.somar(3, 5));
        System.out.println("Resultado: " + es1.somar(3, 5, 2));
        System.out.println("Resultado: " + es1.somar(3.0, 5.0));
        System.out.println("Resultado: " + es1.somar(3, 5.0));
        System.out.println("Resultado: " + es1.somar(3.0, 5)); */
        
        /*Pessoa p = new PessoaFisica();
        Pessoa p1 = new PessoaJuridica();
        
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        
        Pessoa p2 = new Pessoa();
        p2 = pf;
        p2 = pj;*/
        
        Pessoa p1 = new Pessoa();
        
        PessoaFisica pf = new PessoaFisica();
        
        pf.setNome("Teste PF");
        pf.setCpf("12345678900");
        pf.setRg("MG11111111");
        
        PessoaJuridica pj = new PessoaJuridica();
        
        pj.setNome("Teste Pj");
        pj.setCnpj("12345678912345");
        pj.setInscricaoEstadual("67576567586");
        
        Pessoa p2;
        p2 = pf;
        
        //p2 = pj;
        
        p1.cadastrar();
        
        p2.cadastrar();
        
        System.out.println(p2.getNome());
        if(p2 instanceof PessoaFisica pf2){
            System.out.println(pf2.getCpf());
            System.out.println(pf2.getRg());
            pf2.cadastrar();
            
        }else{
            PessoaJuridica pj2 = (PessoaJuridica) p2;
            System.out.println(pj2.getCnpj());
            System.out.println(pj2.getInscricaoEstadual());
            pj2.cadastrar();
        }
    }
}
