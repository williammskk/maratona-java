package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioClasseExercicio {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimirDados() {
        if (salario == null){
            return;
        }
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double num : this.salario) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void imprimirMedia() {
        if (salario == null){
            return;
        }
        double soma = 0;
        for (double num : this.salario) {
            soma += num;
        }
        System.out.println(soma / this.salario.length);
    }
}
