package lpoo_unip;

import models.Veiculo;
import models.Automovel;
import models.Moto;
import models.Caminhao;
import models.Multa;
import models.Motorista;
import java.util.ArrayList;

public class Cadastro extends MenuBase {

    // private ;

    public void cadastro() {
        System.out.println("============================");
        System.out.println("Cadastro");
        System.out.println("\n");
        System.out.println("1- Veiculo");
        System.out.println("2- Motorista");
        System.out.println("3- Multa");
        System.out.println("============================\n");
        System.out.println("Digite a sua opção: ");
        int escolhido = super.getSca().nextInt();
        if (escolhido == 1) {
            this.novoVeiculoMenu();
        } else if (escolhido == 2) {
            this.novoMotoristaMenu();
        } else if (escolhido == 3) {

        } else {
            System.out.println("Opção invalida!");
        }
        return;
    }

    public void novoVeiculoMenu() {
        String marca, modelo, placa;
        Veiculo veiculoEscolhido;
        System.out.println("============================");
        System.out.println("Novo veiculo");
        System.out.println("1- Automovel");
        System.out.println("2- Moto");
        System.out.println("3- Caminhão");
        int escolhido = super.getSca().nextInt();
        System.out.println("");
        System.out.println("Digite a marca:");
        marca = super.getSca().nextLine();
        marca = super.getSca().nextLine();
        System.out.println("");
        System.out.println("Digite o modelo:");
        modelo = super.getSca().nextLine();
        System.out.println("");
        System.out.println("Digite a placa:");
        placa = super.getSca().nextLine();
        if (escolhido == 1) {
            veiculoEscolhido = new Automovel(marca, modelo, placa);
        } else if (escolhido == 2) {
            veiculoEscolhido = new Moto(marca, modelo, placa);
        } else if (escolhido == 3) {
            veiculoEscolhido = new Caminhao(marca, modelo, placa);
        } else {
            System.out.println("Opção invalida!");
            return;
        }
        super.appendVeiculos(veiculoEscolhido);
    }

    public void novoMotoristaMenu() {
        String nome;
        int idade;
        System.out.println("============================");
        System.out.println("Novo motorista");
        System.out.println("Digite o nome:");
        nome = super.getSca().nextLine();
        nome = super.getSca().nextLine();
        System.out.println("");
        System.out.println("Digite a idade:");
        idade = super.getSca().nextInt();

        Motorista motoristaEscolhido = new Motorista(nome, idade);
        vincularVeiculo(motoristaEscolhido);
        super.appendMotoristas(motoristaEscolhido);
        return;
    }

    public void vincularVeiculo(Motorista motorista) {
        ArrayList<Veiculo> veiculos = MenuBase.getVeiculos();
        System.out.println("============================");
        System.out.println("Veiculos");
        System.out.println("\n");

        System.out.println("0- Sair");
        for (int i = 0; i < veiculos.size(); i++) {
            Veiculo veiculoAtual = veiculos.get(i);
            System.out.println((i + 1) + "- " + veiculoAtual.getTipo() + "|" + veiculoAtual.getModelo());
        }

        System.out.println("============================\n");
        System.out.println("Digite a sua opção: ");
        int escolhido = super.getSca().nextInt();
        if (escolhido == 1) {
            return;
        } else {
            motorista.addVeiculos(veiculos.get(escolhido-1));
            this.vincularVeiculo(motorista);
        }
    }

    public void novaMulta() {
        float valor;
        Veiculo veiculo;
        Motorista motorista;
        System.out.println("============================");
        System.out.println("Nova multa");
        System.out.println("Digite o valor:");
        valor = super.getSca().nextFloat();
        System.out.println("");
        System.out.println("============================");
        Listagem.listaVeiculos();
        System.out.println("Selecione o veiculo:");
        ArrayList<Veiculo> veiculos = MenuBase.getVeiculos();
        veiculo = veiculos.get(super.getSca().nextInt());
        System.out.println("");
        System.out.println("============================");
        Listagem.listaVeiculos();
        System.out.println("Selecione o motorista:");
        ArrayList<Motorista> motoristas = MenuBase.getMotoristas();
        motorista = motoristas.get(super.getSca().nextInt());
        Multa multa = new Multa(valor,motorista, veiculo);
        super.appendMultas(multa);
        return;
    }

}
