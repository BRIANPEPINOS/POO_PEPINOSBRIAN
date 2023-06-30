/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionhorarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class GestionHorarios {

    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Ingreso de laboratorios
        System.out.print("Ingrese la cantidad de laboratorios: ");
        int numLaboratorios = scanner.nextInt();
        scanner.nextLine();

        List<Laboratorio> laboratorios = new ArrayList<>();

        for (int i = 0; i < numLaboratorios; i++) {
            System.out.println("\nLaboratorio #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Capacidad: ");
            int capacidad = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Equipos (separados por comas): ");
            String equiposInput = scanner.nextLine();
            List<String> equipos = new ArrayList<>();
            for (String equipo : equiposInput.split(",")) {
                equipos.add(equipo.trim());
            }
            System.out.print("Responsable: ");
            String responsable = scanner.nextLine();

            // Aquí puedes agregar atributos específicos para cada tipo de laboratorio
            // Por ejemplo, si es Laboratorio1 puedes pedir el espacio, si es Laboratorio2 puedes pedir el lugar, etc.

            // Agregar el laboratorio a la lista
            laboratorios.add(new Laboratorio(nombre, capacidad, equipos, responsable));
        }

        // Ingreso de asignaturas
        System.out.print("\nIngrese la cantidad de asignaturas: ");
        int numAsignaturas = scanner.nextInt();
        scanner.nextLine();

        List<Asignatura> asignaturas = new ArrayList<>();

        for (int i = 0; i < numAsignaturas; i++) {
            System.out.println("\nAsignatura #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Horario: ");
            String horario = scanner.nextLine();

            // Asignar un laboratorio a la asignatura
            System.out.println("\nSeleccione un laboratorio para la asignatura:");
            for (int j = 0; j < laboratorios.size(); j++) {
                System.out.println((j + 1) + ". " + laboratorios.get(j).getNombre());
            }
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            // Agregar la asignatura a la lista
            asignaturas.add(new Asignatura(nombre, horario, laboratorios.get(opcion - 1)));
            
        }

        // Mostrar información de los laboratorios
        System.out.println("\nInformación de los laboratorios:");
        for (Laboratorio laboratorio : laboratorios) {
            System.out.println("Nombre: " + laboratorio.getNombre());
            System.out.println("Capacidad: " + laboratorio.getCapacidad());
            System.out.println("Equipos: " + laboratorio.getEquipos());
            System.out.println("Responsable: " + laboratorio.getResponsable());
            System.out.println("Asignaturas asignadas:");

            boolean asignaturasEncontradas = false;
            for (Asignatura asignatura : asignaturas) {
                if (asignatura.getLaboratorio().equals(laboratorio)) {
                    System.out.println("- Nombre de la asignatura: " + asignatura.getNombre());
                    System.out.println("  Horario: " + asignatura.getHorario());
                    asignaturasEncontradas = true;
                }
            }

            if (!asignaturasEncontradas) {
                System.out.println("No hay asignaturas asignadas a este laboratorio.");
            }
        }
            System.out.println();
        }

    }
    

