package gestionsueldosprofesores;

import java.util.Arrays;
import java.util.Scanner;

public class GestionSueldosProfesores {

    static Scanner scanner = new Scanner(System.in);
    static double sueldos[];

    public static void agregarSueldosProfesores() {
        System.out.println("AGREGAR SUELDO DE PROFESORES.");
        for (int indice = 0; indice < sueldos.length; indice++) {
            System.out.println("AGREGUE EL SUELDO NUMERO: " + (indice + 1));
            double ingresoDeSueldos = scanner.nextDouble();
            sueldos[indice] = ingresoDeSueldos;
            System.out.println("SUELDO INGRESADO: " + ingresoDeSueldos);
        }
    }

    public static void ordenarSueldosProfesoresDeMayorAMenor() {
        System.out.println("ORDENAR SUELDOS DE PROFESORES DE MAYOR A MENOR.");
        for (int indice = 0; indice < sueldos.length / 2; indice++) {
            double temporal = sueldos[indice];

            sueldos[indice] = sueldos[sueldos.length - indice - 1];

            sueldos[sueldos.length - indice - 1] = temporal;
        }
        System.out.println(Arrays.toString(sueldos));
    }

    public static void mostrarSueldosProfesores() {
        System.out.println("MOSTRAR SUELDO DE LOS PROFESORES.");
        Arrays.sort(sueldos);
        System.out.println("SUELDOS: " + Arrays.toString(sueldos));
        for (double sueldo : sueldos) {
            System.out.println(sueldo);
        }
    }

    public static void busquedaDeSueldo(double sueldoABuscar) {
        for (int indice = 0; indice < sueldos.length; indice++) {
            if (sueldoABuscar == sueldos[indice]) {
                System.out.println("SUELDO ENCONTRADO: " + Arrays.toString(sueldos));
                System.out.println(sueldos[indice]);
                return ;
            } else {
                System.out.println("SUELDO NO ENCONTRADO.");
                return ;
            }
        }
    }

    public static void salidaDelPrograma() {
        System.out.println("HASTA LUEGO...");
    }

    public static void mostrar() {
        System.out.println("DIGITE CUANTOS SUELDOS DESEA INGRESAR: ");
        int tamanio = scanner.nextInt();
        sueldos = new double[tamanio];
        System.out.println("NUMERO DE SUELDOS A INGRESAR: " + tamanio);
        boolean bool = true;
        while (bool) {
            System.out.println("\nBIENVENIDO AL MENU.");
            System.out.println("1. PARA AGREGAR SUELDOS DE LOS PROFESORES.");
            System.out.println("2. PARA ORDENAR LOS SUELDOS DE LOS PROFESORES DE MAYOR A MENOR.");
            System.out.println("3. PARA BUSCAR CUALQUIER SUELDO.");
            System.out.println("4. PARA MOSTRAR TODOS LOS SUELDOS DE LOS PROFESORES.");
            System.out.println("5. PARA SALIR DEL PROGRAMA.");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    agregarSueldosProfesores();
                    break;

                case 2:
                    ordenarSueldosProfesoresDeMayorAMenor();
                    break;

                case 3:
                    System.out.println("BUSQUEDA DE SUELDO.");
                    System.out.println("INGRESE EL SUELDO A BUSCAR: ");
                    double sueldoABuscar = scanner.nextDouble();
                    busquedaDeSueldo(sueldoABuscar);
                    break;

                case 4:
                    mostrarSueldosProfesores();
                    break;

                case 5:
                    bool = false;
                    salidaDelPrograma();
                    scanner.close();
                    break;

                default:
                    throw new Error("ERROR, OPCION NO VALIDA.");
            }
        }
    }

    public static void main(String[] args) {
        mostrar();
    }

}
