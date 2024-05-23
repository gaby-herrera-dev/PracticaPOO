package ejercicio;

public class Paciente extends Persona {
    public String historiaClinica;
    public String numeroSeguro;
    public  String registrarse;

    public Paciente() {}

    public Paciente(int id, String nombre, String apellidos, int edad, String historiaClinica, String numeroSeguro) {
        super(id, nombre, apellidos, edad);
        this.historiaClinica = historiaClinica;
        this.numeroSeguro = numeroSeguro;
    }



    public void solicitarCita() {
        System.out.println("Paciente solicita una cita");
    }

    public void recibirTratamiento() {
        System.out.println("Paciente recibe tratamiento");
    }

    public void darOpiniones() {
        System.out.println("Paciente da opiniones");
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Historial Clinico :"+ historiaClinica);
        System.out.println("Numero Seguro : "+ numeroSeguro);
    }


}





