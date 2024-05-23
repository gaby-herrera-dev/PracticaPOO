package ejercicio;

public class Doctor extends Persona {
    public String especialidad;
    public int aniosExperiencia;

    public Doctor() {
    }

    public Doctor(int id, String nombre, String apellidos, int edad, String especialidad, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void diagnosticar() {
        System.out.println("Doctor diagnostica a los pacientes");
    }

    public void prescribirTratamiento() {
        System.out.println("Doctor prescribe tratamiento");
    }

    public void darOpiniones() {
        System.out.println("Doctor da su opinion a los pacientes");
    }

    public void darSeguimiento() {
        System.out.println("Doctor da seguimiento a los pacientes");
    }

}
