package academy.devdojo.maratonajava.javacore.Kenum.dominio.Ex02planetas;

public enum Planeta {
    Mercúrio(1, "Rochoso"),
    Vênus(2, "Rochoso"),
    Terra(3, "Rochoso"),
    Marte(4, "Rochoso"),
    Júpiter(5, "Gasoso"),
    Saturno(6, "Gasoso"),
    Urano(7, "Gelado"),
    Netuno(8, "Gelado");

    private final int valor;
    private final String tipo;

    Planeta(int valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public void imprime(){
        System.out.println("Planeta: "+this.name()+" - Posição: "+this.valor+" - Tipo: "+this.tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }
}
