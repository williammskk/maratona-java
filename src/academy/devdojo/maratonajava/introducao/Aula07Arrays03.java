package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        String[] numeros2 = {"Olá!","Tudo bem?"};
        for (int i=0;i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }
        for (String s:numeros2){
            System.out.println(s);
        }
        }
}
