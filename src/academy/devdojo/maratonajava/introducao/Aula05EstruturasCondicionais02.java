package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 17;
        String categoria = "";
        if(idade<15){
            categoria = "Classe: Infantil";
        }else if(idade>=15 && idade <18){
            categoria = "Classe: Juvenil";
        }else{
            categoria = "Classe: Adulto";
        }
        System.out.println(categoria);
    }
}
