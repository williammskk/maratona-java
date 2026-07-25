package meus.exercicios.poo.imposto.dominio;

public class PessoaJuridica extends Contribuinte{
    protected String cnpj;

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", rendaBruta= R$" + rendaBruta +
                '}';
    }

    @Override
    public double calcularImposto(){
        double imposto = 0;
        imposto = this.rendaBruta * 0.1;
        return imposto;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
