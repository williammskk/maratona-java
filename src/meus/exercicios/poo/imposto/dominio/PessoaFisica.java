package meus.exercicios.poo.imposto.dominio;

public class PessoaFisica extends Contribuinte{
    protected String cpf;

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rendaBruta= R$" + rendaBruta +
                '}';
    }

    @Override
    public double calcularImposto(){
        double imposto = 0;
        if(this.rendaBruta <= 1400){
            imposto = this.rendaBruta * 0.0;
        }else if(this.rendaBruta > 1400 && this.rendaBruta <= 2100){
            imposto = (this.rendaBruta * 0.1 - 100);
        } else if (this.rendaBruta > 2100 && this.rendaBruta <= 2800){
            imposto = (this.rendaBruta * 0.15 - 270);
        } else if (this.rendaBruta > 2800 && this.rendaBruta <= 3600) {
            imposto = (this.rendaBruta * 0.25 - 500);
        } else {
            imposto = (this.rendaBruta * 0.3 - 700);
        }
        return imposto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
