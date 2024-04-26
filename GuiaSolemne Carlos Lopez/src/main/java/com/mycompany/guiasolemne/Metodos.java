package com.mycompany.guiasolemne;

import java.util.Scanner;

public class Metodos {

    public static void suma() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero natural: ");
        int n = leer.nextInt();
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma desde 1 hasta " + n + ", es igual a: " + suma);
    }

    public static int factorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }

    public static void potencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una base: ");
        int base = leer.nextInt();
        if (base < 1) {
            System.out.println("La base debe ser un numero entero entero positivo: ");
            leer.next();
        }

        System.out.println("Ingrese un exponente: ");
        int exponente = leer.nextInt();
        if (exponente < 1) {
            System.out.println("El exponente debe ser un numero entero positivo");
        }

        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        System.out.println("La base " + base + ", elevado al exponente " + exponente + ", es igual a: " + resultado);
    }

    public static void primo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = leer.nextInt();

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }

    public static boolean añoRecursivo(int año) {
        if (año % 4 != 0) {
            return false;
        } else if (año % 100 != 0) {
            return true;
        } else if (año % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean primoRecursivo(int numeroPrimo, int divisor) {
        if (numeroPrimo <= 1) {
            return false;
        }
        if (divisor >= numeroPrimo) {
            return true;
        }
        if (numeroPrimo % divisor == 0) {
            return false;
        }
        return primoRecursivo(numeroPrimo, divisor + 1);
    }

    public static void año() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        int año = leer.nextInt();

        if (año % 4 != 0) {
            // si el año no es divisible por 4, no es bisiesto
            System.out.println("El año" + año + ", no es bisiesto");
        } else if (año % 100 != 0) {
            // si el año es divisible por 4, pero no por 100, si es bisiesto
            System.out.println("El año" + año + ", es bisiesto");
        } else if (año % 400 != 0) {
            // si el año es divisible por 100, pero no por 400, no es bisiesto
            System.out.println("El año" + año + ", no es bisiesto");
        } else {
            // si el año es divisible por 400, si es bisiesto
            System.out.println("El año" + año + ", es bisiesto");
        }
    }

    public static void SumaPares() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero con numeros pares: ");
        int numero = leer.nextInt();
        int suma = 0;

        while (numero != 0) {
            int ultimo = numero % 10;
            if (ultimo % 2 == 0) {
                suma += ultimo;
            }
            numero /= 10;
        }

        System.out.println("La suma de los dijitos pares es igual a: " + suma);
    }

    public static int producto(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            int ultimoDigito = numero % 10;
            int restoNumero = numero / 10;
            return ultimoDigito * producto(restoNumero);
        }
    }
}
