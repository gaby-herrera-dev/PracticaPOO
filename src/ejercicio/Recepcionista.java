package ejercicio;

public class Recepcionista extends Persona {
    public String turno;
    public int aniosExperiencia;

    public Recepcionista() {}

    public Recepcionista(int id, String nombre, String apellidos, int edad, String turno, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.turno = turno;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void agendarCitas() {
        System.out.println("Recepcionista agenda citas");
    }

    public void atenderLlamadas() {
        System.out.println("Recepcionista atiende llamadas");
    }
    public void darOpinion() {
        System.out.println("Recepcionista da opnion ");
    }

    public void recibirPaciente() {
        System.out.println("Recepcionista recibe a los pacientes");
    }

}