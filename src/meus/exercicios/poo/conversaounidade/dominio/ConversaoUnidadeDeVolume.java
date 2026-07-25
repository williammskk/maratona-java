package meus.exercicios.poo.conversaounidade.dominio;

public class ConversaoUnidadeDeVolume {
    public static void conversaoLitroParaMetroCubico(double litros){
        System.out.println("Conversão Litro para Metro Cúbico: ");
        System.out.println(litros/1000);
    }
    public static void conversaoMetroCubicoParaLitro(double metroCubico){
        System.out.println("Conversão Metro Cúbico para Litro: ");
        System.out.println(metroCubico*1000);
    }
    public static void conversaoMetroCubicoParaPeCubico(double metroCubico){
        System.out.println("Conversão Metro Cúbico para Pé Cúbico: ");
        System.out.println(metroCubico*35.32);
    }
    public static void conversaoGalaoParaPolegadasCubicas(double galao){
        System.out.println("Conversão Galão para Polegadas Cúbicas: ");
        System.out.println(galao*231);
    }
    public static void conversaoGalaoParaLitros(double galao){
        System.out.println("Conversão Galão para Litro: ");
        System.out.println(galao*3.785);
    }
}
