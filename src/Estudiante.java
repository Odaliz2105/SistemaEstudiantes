import java.text.DecimalFormat;

class Estudiante {
    private String nombre;
    private float total;

    public Estudiante(String nombreEstudiante){
        this.nombre = nombreEstudiante;
        this.total = 0;
    }

    public float Promedio(float notaActual){
        this.total += notaActual;
        return this.total;
    }

    public float getTotal(int numeroNotas) {
        return total/numeroNotas;
    }

    public String getNombre() {
        return this.nombre;
    }
}
