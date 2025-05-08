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

    }
}