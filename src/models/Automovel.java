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
public class Automovel extends Veiculo {

    public Automovel(String marca, String modelo, String placa) {
        super(marca,modelo,placa,"automovel");
    }
    
    @Override
    public void acelerar() {
        System.out.println("VRUUUUMMMM!!");
    }

    @Override
    public void buzinar() {
        System.out.println("BIBI");
    }
    
    
    
}
