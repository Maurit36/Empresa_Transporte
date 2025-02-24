package co.edu.uniquindio.empresaTransporte.model;

public class VehiculoCarga extends Vehiculo {
    private double capacidadCarga;
    private int numeroEjes;

    public VehiculoCarga(String placa, String modelo, String marca, String color,
                         double capacidadCarga, int numeroEjes) {
        super(placa, modelo, marca, color);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}