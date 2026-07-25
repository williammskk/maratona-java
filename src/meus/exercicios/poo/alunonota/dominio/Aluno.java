package meus.exercicios.poo.alunonota.dominio;

public class Aluno {
    private String nome;
    private final String[] materias;
    private final double[] notas;

    public Aluno(String nome, String[] materias, double[] notas) {
        this.nome = nome;
        this.materias = materias;
        this.notas = notas;
    }

    public void calcularNotas(){
        double soma = 0;
        double media = 0;
        for (int i = 0; i < materias.length; i++) {
            System.out.println(materias[i]+": "+notas[i]);
            soma += notas[i];
        }
        media = soma/materias.length;
        System.out.println("Média: "+media);
        if (media >= 7){
            System.out.println("Resultado: Aprovado.");
        }else{
            System.out.println("Resultado: Reprovado.");
        }
    }
}