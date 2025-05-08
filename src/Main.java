import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la primera nota: ");
        Double nota1 = sc.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        Double nota2 = sc.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        Double nota3 = sc.nextDouble();

        //Calcular Promedio
        double promedio=(nota1+nota2+nota3)/3;




    }
}