package academy.devdojo.maratonajava.javacore.Hherança.dominio;

public class Moto extends Veiculo{
    private String tipo;

    public Moto(String nome, String placa, String ano, String tipo){
        super(nome,placa,ano);
        this.tipo = tipo;
    }

    public void imprime(){
        super.imprime();
        System.out.println("Tipo: "+tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
