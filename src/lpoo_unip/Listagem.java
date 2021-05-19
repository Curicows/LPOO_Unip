package lpoo_unip;

import java.util.ArrayList;
import models.Veiculo;
import models.Multa;
import models.Motorista;

public class Listagem extends MenuBase {

    public void listagem() {
        System.out.println("============================");
        System.out.println("Listagem");
        System.out.println("\n");
        System.out.println("1- Veiculos");
        System.out.println("2- Motoristas");
        System.out.println("3- Multas");
        System.out.println("============================\n");
        System.out.println("Digite a sua opção: ");
        int escolhido = super.getSca().nextInt();
        if (escolhido == 1) {
            this.listaVeiculos();
        } else if (escolhido == 2) {
            this.listaMotoristas();
        } else if (escolhido == 3) {
            this.listaMultas();
        } else {
            System.out.println("Opção invalida!");
            return;
        }
        return;
    }

    public static void listaVeiculos() {
        ArrayList<Veiculo> veiculos = MenuBase.getVeiculos();
        System.out.println("\n");
        for (int i = 0; i < veiculos.size(); i++) {
            Veiculo veiculoAtual = veiculos.get(i);
            System.out.println((i + 1) + "- " + veiculoAtual.getTipo() + "|" + veiculoAtual.getModelo());
        }
        System.out.println("");
        return;
    }

    public static void listaMotoristas() {
        ArrayList<Motorista> motoristas = MenuBase.getMotoristas();
        System.out.println("\n");
        for (int i = 0; i < motoristas.size(); i++) {
            Motorista veiculoAtual = motoristas.get(i);
            System.out.println((i + 1) + "- " + veiculoAtual.getNome() + "|" + veiculoAtual.getIdade());
        }
        System.out.println("");
        return;
    }

    public static void listaMultas() {
        ArrayList<Multa> multas = MenuBase.getMultas();
        System.out.println("\n");
        for (int i = 0; i < multas.size(); i++) {
            Multa multaAtual = multas.get(i);
            System.out.println((i + 1) + "- " + multaAtual.getMotorista().getNome() + "|"
                    + multaAtual.getVeiculo().getTipo() + " - " + multaAtual.getValor());
        }
        System.out.println("");
        return;
    }
}
