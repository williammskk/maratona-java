package academy.devdojo.maratonajava.javacore.Hherança.dominio;

public class Veiculo {
    private String nome;
    private String placa;
    private String ano;

    public Veiculo(String nome, String placa, String ano) {
        this.nome = nome;
        this.placa = placa;
        this.ano = ano;
    }

    public void imprime(){
        System.out.println(this.nome+" - Placa: "+this.placa+" - Ano: "+this.ano);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
