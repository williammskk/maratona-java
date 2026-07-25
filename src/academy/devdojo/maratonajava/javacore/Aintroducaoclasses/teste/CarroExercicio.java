package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroExercicio {
    public static void main(String[] args) {
        // Criação do objeto carro:
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        // Colocando as características dos carros:
        carro01.nome = "Chery";
        carro01.modelo = "Face";
        carro01.ano = 2011;

        carro02.nome = "Jeep";
        carro02.modelo = "Renegade";
        carro02.ano = 2021;

        // Imprimindo os valores inseridos:
        System.out.printf("%-15s %-15s %-15s\n","","Carro 1","Carro 2");
        System.out.printf("%-15s %-15s %-15s\n","Nome: ",carro01.nome,carro02.nome);
        System.out.printf("%-15s %-15s %-15s\n","Modelo: ",carro01.modelo,carro02.modelo);
        System.out.printf("%-15s %-15d %-15d\n","Ano: ",carro01.ano,carro02.ano);
    }
}
