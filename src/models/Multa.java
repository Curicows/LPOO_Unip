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
public class Multa {
    
    protected float valor;
    protected Motorista motorista;
    protected Veiculo veiculo;

    public Multa(float valor, Motorista motorista, Veiculo veiculo) {
        this.setValor(valor);
        this.setMotorista(motorista);
        this.setVeiculo(veiculo);
    }
    
    @Override
    public String toString() {
        return "Multa no valor de R$ " + valor + " para o motorista " + motorista.getNome() + " dirigindo o veiculo de placa" + veiculo.getPlaca();
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    
    
}
