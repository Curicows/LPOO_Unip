/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo_unip;


/**
 *
 * @author giova
 */
public class Menu extends MenuBase {

    public void principal() {
        System.out.println("============================");
        System.out.println("Sistema de controle");
        System.out.println("\n");
        System.out.println("1- Listagem");
        System.out.println("2- Cadastrar");
        System.out.println("3- Sair");
        System.out.println("============================\n");
        System.out.println("Digite a sua opção: ");
        int escolhido = super.getSca().nextInt();
        if (escolhido == 1) {
            (new Listagem()).listagem();
        } else if (escolhido == 2) {
            (new Cadastro()).cadastro();
        } else if (escolhido == 3) {
            System.exit(1);
        }
        this.principal();
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

    

}
