package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
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

        String emails = "gokudragonball007@gmail.com, 123jotaro@hotmail.com, !@#zoro@mail.br, narutindograu@outlook.com, neymar.junior@gmail.com";
        String detectarSeEmail = "([a-zA-Z0-9._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        Pattern padraoEmail = Pattern.compile(detectarSeEmail);
        Matcher verificarEmail = padraoEmail.matcher(emails);
        System.out.println("Posições encontradas: ");
        while(verificarEmail.find()){
            System.out.print(verificarEmail.start()+" -> ");
            System.out.println(verificarEmail.group());
        }
    }
}
