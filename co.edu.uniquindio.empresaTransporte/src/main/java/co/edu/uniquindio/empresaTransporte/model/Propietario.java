package co.edu.uniquindio.empresaTransporte.model;

public class Propietario {
    private String nombre, identificacion, email, celular;
    private int edad;
    private double pesoCorporal;
    private Vehiculo vehiculo;

    public Propietario(String nombre, String identificacion, String email,
                       String celular, int edad, double pesoCorporal, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.celular = celular;
        this.edad = edad;
        this.pesoCorporal = pesoCorporal;
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int getEdad() {
        return edad;
    }

    public double getPesoCorporal() {
        return pesoCorporal;
    }

    public String getNombre() {
        return nombre;
    }
}