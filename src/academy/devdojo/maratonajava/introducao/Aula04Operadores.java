package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // soma, subtração, multiplicação e divisão:

        int valorTotal= 67;
        int valorEscolhido= 67;
        double resultadoDivisao= valorEscolhido/100.0;
        double resultadoMultiplicacao= resultadoDivisao*valorTotal;
        String relatorio= valorEscolhido+"% de "+valorTotal+" é igual a "+resultadoMultiplicacao;
        System.out.println(relatorio);

        // operadores booleanos:

        boolean isDezMaiorQueVinte= 10 >= 20;
        System.out.println("Dez é maior que vinte?");
        System.out.println(isDezMaiorQueVinte);
        boolean isDezMenorQueVinte= 10 <= 20;
        System.out.println("Dez é menor que vinte?");
        System.out.println(isDezMenorQueVinte);
        boolean isDezIgualVinte= 10 == 20;
        System.out.println("Dez é igual a vinte?");
        System.out.println(isDezIgualVinte);
        boolean isDezDiferenteDeVinte= 10 != 20;
        System.out.println("Dez é diferente de vinte?");
        System.out.println(isDezDiferenteDeVinte);

        // operadores lógicos && (AND), || OR e ! NOT:

       int tenhoProva= 1;
       int estouDoente= 0;
       boolean resultadoEscola= tenhoProva == 1 && estouDoente == 0;
        System.out.println("Vou para escola? "+resultadoEscola);

       int tenhoChave= 1;
       int tenhoParente= 1;
       boolean resultadoSairDeCasa= tenhoChave == 1 || tenhoParente == 1;
        System.out.println("Posso sair de casa com segurança? "+resultadoSairDeCasa);

       // atribuições:

        int contador = 0;
        System.out.println(contador);
        contador += 1;
        System.out.println(contador);
        contador -= 7;
        System.out.println(contador);
        contador *= 4;
        System.out.println(contador);
        contador /= 10;
        System.out.println(contador);
        contador %= 2;
        System.out.println(contador);
        int contador2= 0;
        System.out.println(++contador2);
    }
}