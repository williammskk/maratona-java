package academy.devdojo.maratonajava.javacore.Hherança.dominio;

public class Caminhao extends Veiculo{
    private double capacidade;

    public Caminhao(String nome, String placa, String ano, double capacidade){
        super(nome,placa,ano);
        this.capacidade = capacidade;
    }

    public void imprime(){
        super.imprime();
        System.out.println("Capacidade de carga: "+this.capacidade+"kg");
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
}
