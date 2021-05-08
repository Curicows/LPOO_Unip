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
    
    protected String marca;
    protected String modelo;
    protected float kilometragem;
    
    public abstract void acelerar();
    public abstract void freiar();
    public abstract void trocarMarcha();

    
}
