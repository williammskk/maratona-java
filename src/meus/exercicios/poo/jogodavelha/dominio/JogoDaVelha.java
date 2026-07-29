package meus.exercicios.poo.jogodavelha.dominio;

public class JogoDaVelha {

    public static void imprimirJogo(char[][] casas) {
        System.out.println();
        for (int i = 0; i < casas.length; i++) {
            for (int j = 0; j < casas[i].length; j++) {
                    System.out.print(" [ "+casas[i][j]+" ] ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean checarSeGanhouReto(char[][] casas) {
        for (int i = 0; i < casas.length; i++) {
            if (casas[i][0] == 'X' && casas[i][1] == 'X' && casas[i][2] == 'X' || casas[i][0] == 'O' && casas[i][1] == 'O' && casas[i][2] == 'O') {
                return true;
            }else if((casas[0][i] == 'X' && casas[1][i] == 'X' && casas[2][i] == 'X' || casas[0][i] == 'O' && casas[1][i] == 'O' && casas[2][i] == 'O')){
                return true;
            }
            if(casas[0][0] == 'X' && casas[1][1] == 'X' && casas[2][2] == 'X' || casas[0][0] == 'O' && casas[1][1] == 'O' && casas[2][2] == 'O'){
                return true;
            }else if(casas[0][2] == 'X' && casas[1][1] == 'X' && casas[2][0] == 'X' || casas[0][2] == 'O' && casas[1][1] == 'O' && casas[2][0] == 'O') {
                return true;
            }
        }
        return false;
    }
}
