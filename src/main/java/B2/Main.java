package B2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");

        scanner.close();

        double altura = 1.75;

       System.out.printf("Nombre: %s, Edad: %d, Altura: %.2f%n", nombre, edad, altura);




    }
}
