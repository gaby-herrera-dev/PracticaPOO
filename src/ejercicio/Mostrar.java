package ejercicio;

import java.util.Scanner;

public class Mostrar {
    public static void main(String[] args) {
        Scanner mostrar = new Scanner(System.in);

        Doctor doctor = new Doctor();
        Recepcionista recepcionista = new Recepcionista();
        Paciente paciente = new Paciente();

        System.out.println("Ingrese los datos del paciente:");
        System.out.print("ID: ");
        paciente.id = mostrar.nextInt();
        System.out.print("Nombre: ");
        paciente.nombre = mostrar.next();
        System.out.print("Apellidos: ");
        paciente.apellido = mostrar.next();
        System.out.print("Edad: ");
        paciente.edad = mostrar.nextInt();
        System.out.print("Historia Clínica: ");
        paciente.historiaClinica = mostrar.next();
        System.out.print("Número de Seguro: ");
        paciente.numeroSeguro = mostrar.next();

        paciente.solicitarCita();
        paciente.recibirTratamiento();
        paciente.darOpiniones();


        System.out.println("\nIngrese los datos del recepcionista:");
        System.out.print("ID: ");
        recepcionista.id = mostrar.nextInt();
        System.out.print("Nombre: ");
        recepcionista.nombre = mostrar.next();
        System.out.print("Apellidos: ");
        recepcionista.apellido = mostrar.next();
        System.out.print("Edad: ");
        recepcionista.edad = mostrar.nextInt();
        System.out.print("Turno: ");
        recepcionista.turno = mostrar.next();
        System.out.print("Años de Experiencia: ");
        recepcionista.aniosExperiencia = mostrar.nextInt();


        recepcionista.agendarCitas();
        recepcionista.atenderLlamadas();
        recepcionista.recibirPaciente();


        System.out.println("\nIngrese los datos del doctor:");
        System.out.print("ID: ");
        doctor.id = mostrar.nextInt();
        System.out.print("Nombre: ");
        doctor.nombre = mostrar.next();
        System.out.print("Apellidos: ");
        doctor.apellido = mostrar.next();
        System.out.print("Edad: ");
        doctor.edad = mostrar.nextInt();
        System.out.print("Especialidad: ");
        doctor.especialidad = mostrar.next();
        System.out.print("Años de Experiencia: ");
        doctor.aniosExperiencia = mostrar.nextInt();


        doctor.diagnosticar();
        doctor.prescribirTratamiento();
        doctor.darSeguimiento();
    }
}
