package co.edu.uniquindio.empresaTransporte;

import co.edu.uniquindio.empresaTransporte.model.*;
import java.util.*;

public class MainTransporte {
    private static List<Propietario> propietarios = new ArrayList<>();
    private static Map<String, Integer> pasajerosTransportados = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        {
            Propietario propietarioCarga = inicializarDatos(scanner);
            propietarios.add(propietarioCarga);
            System.out.println("Propietario y vehículo de carga registrados exitosamente.");
        }

        List<VehiculoTransporte> vehiculosPasajeros = Arrays.asList(
                new VehiculoTransporte("QJH103", "2026", "Toyota",
                        "Rojo", 50),
                new VehiculoTransporte("FOS546", "2023", "Hyundai",
                        "Azul", 40),
                new VehiculoTransporte("IGR033", "2021", "Mercedes",
                        "Negro", 30)
        );

        propietarios.add(new Propietario("Fabián Gallego", "1033710688",
                "@fabis", "317576", 35, 72.0,
                vehiculosPasajeros.get(0)));
        propietarios.add(new Propietario("Nelson Gallego", "87654321",
                "@nelson", "3117654321", 57, 88.5,
                vehiculosPasajeros.get(1)));
        propietarios.add(new Propietario("Marina Sánchez", "56781234",
                "@marina", "3209876543", 60, 82.3,
                vehiculosPasajeros.get(2)));

        int totalPasajeros = 0;
        for (VehiculoTransporte vp : vehiculosPasajeros) {
            System.out.print("Ingrese la cantidad de pasajeros transportados " +
                    "por " + vp.getPlaca() + ": ");
            int pasajerosHoy = scanner.nextInt();
            pasajerosTransportados.put(vp.getPlaca(), pasajerosHoy);
            totalPasajeros += pasajerosHoy;
        }

        System.out.println("El total de pasajeros transportados hoy es: " + totalPasajeros);

        System.out.print("Ingrese la placa del vehículo de transporte para consultar " +
                "pasajeros transportados: ");
        scanner.nextLine();
        String placaBuscada = scanner.nextLine();

        if (pasajerosTransportados.containsKey(placaBuscada)) {
            System.out.println("El vehículo con placa " + placaBuscada + " transportó " +
                    pasajerosTransportados.get(placaBuscada) + " pasajeros hoy.");
        } else {
            System.out.println("No se encontró un vehículo de transporte con la placa " +
                    "ingresada.");
        }

        System.out.println("Propietarios que superan los 40 años:");
        for (Propietario propietario : propietarios) {
            if (propietario.getEdad() > 40) {
                System.out.println("Nombre: " + propietario.getNombre() + ", Edad: "
                        + propietario.getEdad() + " años");
            }
        }

        System.out.print("Ingrese un valor de peso corporal para filtrar propietarios: ");
        double pesoIngresado = scanner.nextDouble();

        System.out.println("Propietarios con peso corporal superior a " + pesoIngresado + " kg:");
        for (Propietario propietario : propietarios) {
            if (propietario.getPesoCorporal() > pesoIngresado) {
                System.out.println("Nombre: " + propietario.getNombre() + ", Peso corporal: "
                        + propietario.getPesoCorporal() + " kg");
            }
        }

        scanner.close();
    }

    private static Propietario inicializarDatos(Scanner scanner) {
        System.out.print("Ingrese nombre del propietario: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese identificación del propietario: ");
        String identificacion = scanner.nextLine();

        System.out.print("Ingrese email del propietario: ");
        String email = scanner.nextLine();

        System.out.print("Ingrese número de celular del propietario: ");
        String celular = scanner.nextLine();

        System.out.print("Ingrese edad del propietario: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese peso corporal del propietario: ");
        double pesoCorporal = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese placa del vehículo de carga: ");
        String placa = scanner.nextLine();

        System.out.print("Ingrese modelo del vehículo de carga: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese marca del vehículo de carga: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese color del vehículo de carga: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese capacidad de carga (toneladas): ");
        double capacidadCarga = scanner.nextDouble();

        System.out.print("Ingrese número de ejes: ");
        int numeroEjes = scanner.nextInt();
        scanner.nextLine();

        VehiculoCarga vehiculoCarga = new VehiculoCarga(placa, modelo, marca,
                color, capacidadCarga, numeroEjes);
        return new Propietario(nombre, identificacion, email, celular, edad,
                pesoCorporal, vehiculoCarga);
    }
}