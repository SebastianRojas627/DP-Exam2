package ejercicio4;

public class Estudiante {

    public String ci;
    public String nombre;
    public String fechaNacimiento;
    public String carrera;

    public Estudiante(String ci, String nombre, String fechaNacimiento, String carrera) {

        this.ci = ci;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.carrera = carrera;
    }

    public String getCi() {
        return ci;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCarrera() {
        return carrera;
    }
}
