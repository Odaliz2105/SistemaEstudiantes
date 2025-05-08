import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int it = 0;

        System.out.println("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = teclado.nextLine();
        System.out.println("Ingrese cuántas notas va a registrar:");
        int numeroNotas = teclado.nextInt();
        teclado.nextLine();

        Estudiante cursoActual = new Estudiante(nombreEstudiante);
        while (it<numeroNotas) {
            System.out.println("Ingrese el nombre la nota #"+(it+1)+":");
            float notaActual = teclado.nextFloat();
            teclado.nextLine();
            if (0<=notaActual && notaActual <= 10) {
                cursoActual.Promedio(notaActual);
                it++;
            }else {
                System.out.println("El nota no es válida. Intente de nuevo (0 a 10)");
            }
        }

        if (0<=cursoActual.getTotal(numeroNotas) && cursoActual.getTotal(numeroNotas)<7){
            System.out.println("El estudiante " + cursoActual.getNombre() + " reprueba con: " + cursoActual.getTotal(numeroNotas));
        } else{
            System.out.println("El estudiante "+cursoActual.getNombre()+" reprueba con: " + cursoActual.getTotal(numeroNotas));
        }

        teclado.close();
    }
}

