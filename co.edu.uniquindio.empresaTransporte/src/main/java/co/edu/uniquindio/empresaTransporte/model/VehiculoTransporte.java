package co.edu.uniquindio.empresaTransporte.model;

public class VehiculoTransporte extends Vehiculo {
    private int maxPasajeros;

    public VehiculoTransporte(String placa, String modelo, String marca, String color,
                              int maxPasajeros) {
        super(placa, modelo, marca, color);
        this.maxPasajeros = maxPasajeros;
    }

    public int getMaxPasajeros() {
        return maxPasajeros;
    }
}