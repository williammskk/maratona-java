package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class ExLocal {
    private String endereco;
    private ExSeminarios seminario;

    public ExLocal(String endereco) {
        this.endereco = endereco;
    }

    public ExLocal(String endereco, ExSeminarios seminario) {
        this.endereco = endereco;
        this.seminario = seminario;
    }

    public void imprime() {
        System.out.println("Local: " + this.endereco);
        if (seminario == null) {
            return;
        } else {
            System.out.println("Seminário(s): ");
            System.out.println(seminario.getTitulo());
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ExSeminarios getSeminario() {
        return seminario;
    }

    public void setSeminario(ExSeminarios seminario) {
        this.seminario = seminario;
    }
}
