package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double totalImposto = 0;
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;
        double salarioLiquido = 0;
        if(salarioAnual<=34712){
            totalImposto = primeiraFaixa * salarioAnual;
            salarioLiquido = salarioAnual-(primeiraFaixa*salarioAnual);
        }else if(salarioAnual>34712 && salarioAnual<=68507){
            totalImposto = segundaFaixa * salarioAnual;
            salarioLiquido = salarioAnual-(segundaFaixa*salarioAnual);
        }else{
            totalImposto = terceiraFaixa * salarioAnual;
            salarioLiquido = salarioAnual-(terceiraFaixa *salarioAnual);
        }
        System.out.println("O meu salário depois dos impostos é € "+salarioLiquido+".");
        System.out.println("Eu pago anualmente € "+totalImposto+" de imposto.");
    }
}
