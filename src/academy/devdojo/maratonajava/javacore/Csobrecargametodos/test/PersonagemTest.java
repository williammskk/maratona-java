package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Personagem;

public class PersonagemTest {
    public static void main(String[] args) {
        Personagem personagem01 = new Personagem();
        Personagem personagem02 = new Personagem();
        Personagem personagem03 = new Personagem();

        personagem01.init("Oni", "Assassino");
        personagem01.imprime();
        System.out.println();
        personagem02.init("Hillbilly", "Assassino",40,4.6);
        personagem02.imprime();
        System.out.println();
        personagem03.init("Trapper", "Assassino",32,4.6,"Brutal Strength");
        personagem03.imprime();

        System.out.println("----------------------");

        personagem01.setTerrorradius(32);
        personagem01.setVelocidade(4.6);
        personagem01.setPerks("Save the Best for Last");
        personagem01.imprime();
        System.out.println();
        personagem02.setPerks("Endurance");
        personagem02.imprime();
        System.out.println();
        personagem03.imprime();
    }
}
