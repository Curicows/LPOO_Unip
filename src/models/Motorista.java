/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author giova
 */
public class Motorista {
    
    private String nome;
    private int idade;
    private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    
    public Motorista(String nome, int idade) {
        this.setIdade(idade);
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<Veiculo> addVeiculos() {
        return veiculos;
    }

    public void addVeiculos(Veiculo veiculos) {
        this.veiculos.add(veiculos);
    }
    
}
