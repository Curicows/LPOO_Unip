/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo_unip;

import java.util.Scanner;
import models.Veiculo;
import models.Automovel;
import models.Moto;
import models.Caminhao;
import models.Multa;
import models.Motorista;

/**
 *
 * @author giova
 */
public class Menu {
    
    Scanner sca;

    public Menu() {
        this.sca = new Scanner(System.in);
    }
    
    public void principal() {
        System.out.println("");
        System.out.flush();
        sca.nextLine();
    }
    
    public void novoVeiculo() {
        Veiculo veiculo = null;
        System.out.println("Novo veiculo: ");
        System.out.println("1- Automovel");
        System.out.println("2- Moto");
        System.out.println("3- Caminhão");
        int escolhido = this.getSca().nextInt();
        if (escolhido == 1) {
            
        } else if (escolhido == 2) {
            
        } else if (escolhido == 3) {
            
        } else {
            System.out.println("Opção invalida!");
        }
        
    }
    
    //public
    
    public void novoMotorista() {
        
    }
    
    public void novaMulta() {
        
    }
    
    public void limparTela() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
    
    
    

    public Scanner getSca() {
        return sca;
    }

    public void setSca(Scanner sca) {
        this.sca = sca;
    }
    
    
}
