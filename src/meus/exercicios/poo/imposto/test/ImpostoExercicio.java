package meus.exercicios.poo.imposto.test;

import meus.exercicios.poo.imposto.dominio.Contribuinte;
import meus.exercicios.poo.imposto.dominio.PessoaFisica;
import meus.exercicios.poo.imposto.dominio.PessoaJuridica;

public class ImpostoExercicio {
    public static void main(String[] args) {

        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Arlei");
        p1.setRendaBruta(2500);
        p1.setCpf("321.126.535-12");

        PessoaJuridica p2 = new PessoaJuridica();
        p2.setNome("ARGAMASSA MIX LTDA");
        p2.setRendaBruta(1000000);
        p2.setCnpj("12.126.535/5315.21");

        PessoaFisica p3 = new PessoaFisica();
        p3.setNome("Joseilson");
        p3.setRendaBruta(3000);
        p3.setCpf("123.612.341-51");

        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNome("AMOGUÇ ÇUÇ LTDA");
        p4.setRendaBruta(2100000);
        p4.setCnpj("51.761.123/4545.11");

        PessoaFisica p5 = new PessoaFisica();
        p5.setNome("Aninha");
        p5.setRendaBruta(2450);
        p5.setCpf("867.612.413-13");

        PessoaJuridica p6 = new PessoaJuridica();
        p6.setNome("IA LTDA");
        p6.setRendaBruta(3200000);
        p6.setCnpj("51.162.213/4141.42");

        Contribuinte[] contribuintes = {p1,p2,p3,p4,p5,p6};
        for (Contribuinte contribuinte : contribuintes) {
            System.out.println("------------");
            System.out.println(contribuinte);
            System.out.println("Imposto: R$" + contribuinte.calcularImposto());
        }
    }
}
