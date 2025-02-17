package co.edu.uniquindio.empresaTransporte.model;

public abstract class Vehiculo {
    protected String placa, modelo, marca, color;

    public Vehiculo(String placa, String modelo, String marca, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }
}