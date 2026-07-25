package academy.devdojo.maratonajava.javacore.Hherança.dominio;

public class Carro extends Veiculo {
    private String combustivel;

    public Carro(String nome, String placa, String ano, String combustivel){
        super(nome,placa,ano);
        this.combustivel = combustivel;
    }

    public void imprime(){
        super.imprime();
        System.out.println("Combustível: "+this.combustivel);
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
