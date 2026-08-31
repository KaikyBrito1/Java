package com.mycompany.empresa_tecnologia;

import java.util.ArrayList;
import java.util.List;

public class Empresa_Tecnologia {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Carlos");
        f1.setSalarioBase(3000.0);

        Gerente g1 = new Gerente();
        g1.setNome("Ana");
        g1.setSalarioBase(6000.0);
        g1.setBonus(1500.0);

        Desenvolvedor d1 = new Desenvolvedor();
        d1.setNome("Lucas");
        d1.setSalarioBase(4500.0);
        d1.setHorasExtras(10);
        d1.setValorHoraExtra(50.0);

        // Adicionando à lista genérica de Funcionario
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(f1);
        funcionarios.add(g1);
        funcionarios.add(d1);

        // Laço de repetição com Polimorfismo
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome() + " | Salário Final: R$ " + f.calcularSalario());
        }
    }
}