package com.mycompany.guiasolemne;

import static com.mycompany.guiasolemne.Metodos.factorial;
import static com.mycompany.guiasolemne.Metodos.añoRecursivo;
import static com.mycompany.guiasolemne.Metodos.primoRecursivo;
import static com.mycompany.guiasolemne.Metodos.producto;
import java.util.Scanner;

public class GuiaSolemne {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int menu = 0;

        System.out.println("Bienvenido a su programa");
        System.out.println("1- Suma de numeros naturales");
        System.out.println("2- Calcular factorial");
        System.out.println("3- Calcular potencia");
        System.out.println("4- Verificar numero primo con ciclos");
        System.out.println("5- Determinar año viciesto con recursividad");
        System.out.println("6- Verificar numero primo con recursividad");
        System.out.println("7- Determinar año viciesto con ciclos");
        System.out.println("8- Suma de numeros pares");
        System.out.println("9- Producto de dos digitos con recursividad");
        System.out.println("0- Salir");

        while (!leer.hasNextInt()) {
            System.out.println("Error. Ingrese un numero entero.");
            leer.next();
        }

        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                Metodos mostrarSuma = new Metodos();
                mostrarSuma.suma();
                break;
            case 2:
                System.out.println("Ingrese un numero: ");
                int numero = leer.nextInt();
                int factorial = factorial(numero);
                System.out.println("El factorial de " + numero + ", es igual a: " + factorial);
                break;
            case 3:
                Metodos mostrarPotencia = new Metodos();
                mostrarPotencia.potencia();
                break;
            case 4:
                Metodos mostrarPrimo = new Metodos();
                mostrarPrimo.primo();
                break;
            case 5:
                System.out.print("Ingrese un año: ");
                int año = leer.nextInt();
                if (añoRecursivo(año)) {
                    System.out.println("El año " + año + ", es bisiesto.");
                } else {
                    System.out.println("El año " + año + ", no es bisiesto.");
                }
            case 6:
                System.out.println("Ingrese un numero: ");
                int numeroPrimo = leer.nextInt();

                if (primoRecursivo(numeroPrimo, 2)) {
                    System.out.println("El numero es primo");
                } else {
                    System.out.println("El numero no es primo");
                }
            case 7:
                Metodos mostrarAño = new Metodos();
                mostrarAño.año();
                break;
            case 8:
                Metodos mostrarSumaPares = new Metodos();
                mostrarSumaPares.SumaPares();
                break;
            case 9:
                System.out.print("Ingrese un número entero: ");
                int numeroProducto = leer.nextInt();
                int producto = producto(numeroProducto);
                System.out.println("El producto de los dígitos de "+numeroProducto+", es igual a: "+producto);
                break;
            default:
                System.out.println("Opcion invalida. Ingrese una opcion valida");
                break;
        }
    }
}
