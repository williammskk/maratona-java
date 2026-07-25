package academy.devdojo.maratonajava.javacore.Hherança.test;

import academy.devdojo.maratonajava.javacore.Hherança.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Moto;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Caminhao;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Veiculo;

public class VeiculoTest01 {
    public static void main(String[] args) {
        System.out.println("--- Veículos ---");

        Carro carro = new Carro("Carro","ABC-1234","2020","Gasolina");
        Moto moto = new Moto("Moto","XYZ-9876","2018","Moto esportiva");
        Caminhao caminhao = new Caminhao("Caminhão","DEF-5678","2022",2000);

        carro.imprime();
        System.out.println();
        moto.imprime();
        System.out.println();
        caminhao.imprime();
    }
}
