/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author giova
 */
public abstract class Veiculo {
    
    private String marca;
    private String modelo;
    private String placa;
    private String tipo;
    
    
    public Veiculo(String marca, String modelo, String placa, String tipo) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPlaca(placa);
        this.setTipo(tipo);
    }
    
    
    public abstract void acelerar();
    public abstract void buzinar();
    
    
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
