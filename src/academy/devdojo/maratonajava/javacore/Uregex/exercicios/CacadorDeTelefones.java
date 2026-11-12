package academy.devdojo.maratonajava.javacore.Uregex.exercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CacadorDeTelefones {
    public static void main(String[] args) {
        // \d = Todos os dígitos;
        // \D = Tudo que não for dígito;
        // \s = Todos os espaços em branco \t \n \f \r;
        // \S = Todos os caracteres, exceto os espaços em branco;
        // \w = a-Z A-Z, dígitos e _;
        // \W = Tudo que não for incluso no \w;
        // [] = Todos conforme as condições dentro dos colchetes;
        // ? = zero ou uma ocorrência;
        // * = zero ou mais ocorrência;
        // + = uma ou mais ocorrências;
        // {n,m} = de n até m;
        // () = metacaracteres de agrupamento;
        // | = Representa o OU, exemplo: o(v|c)o;
        // $ = Representa o fim da linha.
        // . = Como um coringa, detecta qualquer valor. Exemplo em 1.3, o "." pode ser
        // literalmente qualquer valor desde que esteja entre o 1 e o 3.

        String texto = "Contatos: Ana (11) 98765-4321, Bruno 21 99999-1234, Carla (31) 3456-7890, " +
                "CPF 123.456.789-00, CEP 07000-000, Diego (85) 91234-5678 e o ano de 2026.";
        String regex = "(\\(\\d{2}\\)|\\d{2})\\s(\\d{5}|\\d{4})-\\d{4}";
        Pattern padraoTelefone = Pattern.compile(regex);
        Matcher verificarTelefone = padraoTelefone.matcher(texto);

        System.out.println("=== TELEFONES ENCONTRADOS ===");
        int totalTelefones = 0;
        while(verificarTelefone.find()){
            totalTelefones++;
            System.out.print("Posição: ");
            System.out.print(verificarTelefone.start()+1);
            System.out.print(" -> "+verificarTelefone.group()+"\n");
        }
        System.out.println("Total de telefones: "+totalTelefones);
    }
}
