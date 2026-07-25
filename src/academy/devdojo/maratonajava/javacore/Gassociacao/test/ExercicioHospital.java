package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Hospital;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Medico;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Paciente;

public class ExercicioHospital {
    public static void main(String[] args) {
        Medico medico01 = new Medico ("Arlei","Cirurgião");
        Medico medico02 = new Medico ("Dorlei","Urologista");

        Paciente paciente01 = new Paciente ("Adeval",21);
        Paciente paciente02 = new Paciente ("Azoral",19);

        paciente01.setMedico(medico01);
        paciente02.setMedico(medico02);

        Paciente[] pacientes = {paciente01, paciente02};

        medico01.setPacientes(pacientes);

        Medico[] medicos = {medico01, medico02};

        Hospital hospital = new Hospital("Juciares dos Santos PA", medicos);

        System.out.println("---------");
        System.out.println("Médicos");
        medico01.imprime();
        medico02.imprime();

        System.out.println("---------");
        System.out.println("Pacientes");
        paciente01.imprime();
        paciente02.imprime();

        System.out.println("---------");
        System.out.println("Hospitais");
        hospital.imprime();
    }
}
