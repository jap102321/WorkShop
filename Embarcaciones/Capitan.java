package Embarcaciones;

public class Capitan {

    private String nombre;
    private String apellido;
    private int matricula_navegacion;

    public Capitan(){

    }

    public Capitan(String nombre, String apellido, int matricula_navegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula_navegacion = matricula_navegacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getMatricula_navegacion() {
        return matricula_navegacion;
    }

    public void setMatricula_navegacion(int matricula_navegacion) {
        this.matricula_navegacion = matricula_navegacion;
    }

    @Override
    public String toString() {
        return "Capitan{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", matricula_navegacion=" + matricula_navegacion +
                '}';
    }
}
