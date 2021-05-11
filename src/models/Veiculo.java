/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author giova
 */
public abstract class Veiculo {
    
    private String marca;
    private String modelo;
    private String placa;
    
    
    public Veiculo(String marca, String modelo, String placa) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPlaca(placa);
    }
    
    
    public abstract void acelerar();
    public abstract void buzinar();
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    
}
