package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ClasseFuncionarioPrivate {
    private String nome;
    private double salario;
    private String cargo;

    public void setNome (String nome){
        this.nome = nome;
    }
    public void setSalario (double salario){
        if(salario < 0){
            System.out.println("Salário inválido. Tente novamente.");
            return;
        }
            this.salario = salario;
    }
    public void setCargo (String cargo){
        this.cargo = cargo;
    }
    public String getNome(){
        return this.nome;
    }
    public double getSalario(){
        return this.salario;
    }
    public String getCargo(){
        return this.cargo;
    }

}
