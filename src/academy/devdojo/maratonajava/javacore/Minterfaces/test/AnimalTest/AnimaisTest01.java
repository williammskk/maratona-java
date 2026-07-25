package academy.devdojo.maratonajava.javacore.Minterfaces.test.AnimalTest;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Animal.Cachorro;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Animal.Gato;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Animal.Passaro;

public class AnimaisTest01 {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Passaro passaro = new Passaro();
        cachorro.somDoAnimal();
        gato.somDoAnimal();
        passaro.somDoAnimal();
    }
}
